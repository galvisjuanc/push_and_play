package com.galvisjuanc.play.push.domain.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record UpdateMovieDto(
        @NotBlank(message = "Title is required")
        String title,
        LocalDate releaseDate,
        Double rating
) {
}
