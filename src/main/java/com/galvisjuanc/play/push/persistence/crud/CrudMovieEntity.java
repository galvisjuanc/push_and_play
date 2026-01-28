package com.galvisjuanc.play.push.persistence.crud;

import com.galvisjuanc.play.push.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {

    MovieEntity findFirstByTitle(String title);
}
