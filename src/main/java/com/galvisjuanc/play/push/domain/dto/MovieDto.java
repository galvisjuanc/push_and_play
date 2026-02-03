package com.galvisjuanc.play.push.domain.dto;

import com.galvisjuanc.play.push.domain.Genre;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record MovieDto(
        Long id,
        @NotBlank(message = "Movie must have a title and not be empty")
        String title,

        Integer duration,
        Genre genre,
        LocalDate releaseDate,
        Double rating,
        Boolean state
) {
}
