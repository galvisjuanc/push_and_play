package com.galvisjuanc.play.push.domain.dto;

import com.galvisjuanc.play.push.domain.Genre;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record MovieDto(
        Long id,
        @NotBlank(message = "Movie must have a title and not be empty")
        String title,

        @Positive(message = "Must be a positive value")
        Integer duration,

        Genre genre,

        @PastOrPresent(message = "Release date should not be after the present date")
        LocalDate releaseDate,

        @Min(value = 0, message = "Rating must not be less than zero.")
        @Max(value = 5, message = "Rating must not be more than five.")
        Double rating,

        Boolean state
) {
}
