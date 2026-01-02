package com.galvisjuanc.play.push.domain.dto;

import com.galvisjuanc.play.push.domain.Genre;

import java.time.LocalDate;

public record MovieDto(
        String title,
        Integer duration,
        Genre genre,
        LocalDate releaseDate,
        Double rating,
        Boolean state
) {
}
