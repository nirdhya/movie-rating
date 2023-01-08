package com.onitotech.movierating.controller;

import com.onitotech.movierating.model.Movies;
import com.onitotech.movierating.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieRating {

    @GetMapping("/longest-duration-movie")
    public ResponseEntity<List<Movies>> getLongestDurationMovies() {
        return ResponseEntity.ok().body(MovieService.getLongestDurationMovies());
    }

    @PostMapping("/new-movies")
    public ResponseEntity<Movies> saveNewMovies(@RequestBody Movies movies) {
            URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/new-movies").toUriString());
            return ResponseEntity.created(uri).body((Movies) MovieService.saveNewMovies(movies));
    }

    @GetMapping("/top-rated-movies")
    public ResponseEntity<List<Movies>> getTopRatedMovies(){
        return ResponseEntity.ok().body((List<Movies>) MovieService.getTopRatedMovies());
    }

}
