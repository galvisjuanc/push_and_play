package com.galvisjuanc.play.push.domain.exception;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(String message) {
        super(message);
    }

    public MovieNotFoundException() {
        super("movie-not-found");
    }
}
