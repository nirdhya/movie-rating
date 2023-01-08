package com.onitotech.movierating.repository;

import com.onitotech.movierating.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movies, String> {
}
