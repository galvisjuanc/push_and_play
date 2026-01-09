package com.galvisjuanc.play.push.domain.dto;

import com.galvisjuanc.play.push.domain.Genre;

import java.time.LocalDate;

public record UpdateMovieDto(
        String title,
        LocalDate releaseDate,
        Double rating
) {
}
