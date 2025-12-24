package com.galvisjuanc.play.push.web.controller;

import com.galvisjuanc.play.push.persistence.crud.CrudMovieEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    private final CrudMovieEntity crudMovieEntity;

    public MovieController(CrudMovieEntity crudMovieEntity) {
        this.crudMovieEntity = crudMovieEntity;
    }
}
