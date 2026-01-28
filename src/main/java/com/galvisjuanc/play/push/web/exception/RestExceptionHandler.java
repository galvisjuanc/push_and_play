package com.galvisjuanc.play.push.web.exception;

import com.galvisjuanc.play.push.domain.exception.MovieAlreadyExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(MovieAlreadyExistsException.class)
    public ResponseEntity<Error> handleException(Exception exception) {

        Error error = new Error("movie-already-exists", exception.getMessage());
        return ResponseEntity.badRequest().body(error);
    }
}
