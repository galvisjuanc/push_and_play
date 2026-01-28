package com.galvisjuanc.play.push.domain.exception;

public class MovieAlreadyExistsException extends RuntimeException {
    public MovieAlreadyExistsException(String message) {
        super("The movie " + message + " already exist in Play Push Platform.");
    }
}
