package com.galvisjuanc.play.push.web.controller;

import com.galvisjuanc.play.push.domain.dto.MovieDto;
import com.galvisjuanc.play.push.domain.dto.SuggestRequestDto;
import com.galvisjuanc.play.push.domain.dto.UpdateMovieDto;
import com.galvisjuanc.play.push.domain.service.MovieService;
import com.galvisjuanc.play.push.domain.service.PlayPushAiService;
import dev.langchain4j.service.spring.AiService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;
    private final PlayPushAiService aiService;

    public MovieController(MovieService movieService, PlayPushAiService aiService) {
        this.movieService = movieService;
        this.aiService = aiService;
    }

    @GetMapping
    public ResponseEntity<List<MovieDto>> getAll() {
        return ResponseEntity.ok(this.movieService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getById(@PathVariable long id) {
        MovieDto movieDto = this.movieService.getById(id);

        if (movieDto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(movieDto);
    }

    @PostMapping
    public ResponseEntity<MovieDto> create(@RequestBody @Valid MovieDto movieDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.movieService.create(movieDto));
    }

    @PostMapping("/suggest")
    public ResponseEntity<String> generateMoviesSuggestion(@RequestBody SuggestRequestDto suggestRequestDto) {
        return ResponseEntity.ok(this.aiService.generateMoviesSuggestion(suggestRequestDto.userPreferences()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovieDto> update(@PathVariable long id, @RequestBody @Valid UpdateMovieDto updateMovieDto) {
        return ResponseEntity.ok(this.movieService.update(id, updateMovieDto))  ;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        this.movieService.delete(id);

        return ResponseEntity.ok("Movie with ID " + id + " has been deleted");
    }
}
