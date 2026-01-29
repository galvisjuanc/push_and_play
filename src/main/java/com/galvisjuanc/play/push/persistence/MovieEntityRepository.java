package com.galvisjuanc.play.push.persistence;

import com.galvisjuanc.play.push.domain.dto.MovieDto;
import com.galvisjuanc.play.push.domain.dto.UpdateMovieDto;
import com.galvisjuanc.play.push.domain.exception.MovieAlreadyExistsException;
import com.galvisjuanc.play.push.domain.exception.MovieNotFoundException;
import com.galvisjuanc.play.push.domain.repository.MovieRepository;
import com.galvisjuanc.play.push.persistence.crud.CrudMovieEntity;
import com.galvisjuanc.play.push.persistence.entity.MovieEntity;
import com.galvisjuanc.play.push.persistence.mapper.MovieMapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class MovieEntityRepository implements MovieRepository {

    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity,
                                 MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> getAll() {
        return this.movieMapper.toDto(this.crudMovieEntity.findAll());
    }

    @Override
    public MovieDto getById(long id) {

        MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElseThrow(MovieNotFoundException::new);
        return this.movieMapper.toDto(movieEntity);
    }

    @Override
    public MovieDto save(MovieDto movieDto) {

        if (this.crudMovieEntity.findFirstByTitle(movieDto.title()) != null) {
            throw new MovieAlreadyExistsException(movieDto.title());
        }
        MovieEntity  movieEntity = this.movieMapper.toEntity(movieDto);
        movieEntity.setState("D");

        return this.movieMapper.toDto(this.crudMovieEntity.save(movieEntity));
    }

    @Override
    public MovieDto update(long id, UpdateMovieDto updateMovieDto) {
        MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElseThrow(MovieNotFoundException::new);

        if (movieEntity == null)
            return null;

        this.movieMapper.updateEntityFromDto(updateMovieDto, movieEntity);
        return this.movieMapper.toDto(this.crudMovieEntity.save(movieEntity));
    }

    @Override
    public void deleteById(long id) {
        this.crudMovieEntity.findById(id).ifPresent(crudMovieEntity::delete);
    }
}
