package com.galvisjuanc.play.push.domain.repository;

import com.galvisjuanc.play.push.domain.dto.MovieDto;
import com.galvisjuanc.play.push.domain.dto.UpdateMovieDto;

import java.util.List;

public interface MovieRepository {

    List<MovieDto> getAll();

    MovieDto getById(long id);

    MovieDto save(MovieDto movieDto);

    MovieDto update(long id, UpdateMovieDto updateMovieDto);

    void deleteById(long id);
}
