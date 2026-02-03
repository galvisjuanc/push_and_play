package com.galvisjuanc.play.push.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record UpdateMovieDto(
        @NotBlank(message = "Title is required")
        String title,

        @PastOrPresent(message = "Release date should not be after the present date")
        LocalDate releaseDate,
        Double rating
) {
}
