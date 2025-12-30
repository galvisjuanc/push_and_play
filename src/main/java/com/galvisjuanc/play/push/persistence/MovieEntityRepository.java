package com.galvisjuanc.play.push.persistence;

import com.galvisjuanc.play.push.domain.dto.MovieDto;
import com.galvisjuanc.play.push.domain.repository.MovieRepository;
import com.galvisjuanc.play.push.persistence.crud.CrudMovieEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieEntityRepository implements MovieRepository {

    private final CrudMovieEntity crudMovieEntity;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity) {
        this.crudMovieEntity = crudMovieEntity;
    }

    @Override
    public List<MovieDto> getAll() {
        return List.of();
    }
}
