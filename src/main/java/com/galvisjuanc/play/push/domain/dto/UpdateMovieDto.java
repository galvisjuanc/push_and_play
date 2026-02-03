package com.galvisjuanc.play.push.domain.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record UpdateMovieDto(
        @NotBlank(message = "Title is required")
        String title,

        @PastOrPresent(message = "Release date should not be after the present date")
        LocalDate releaseDate,

        @Min(value = 0, message = "Rating must not be less than zero.")
        @Max(value = 5, message = "Rating must not be more than five.")
        Double rating
) {
}
