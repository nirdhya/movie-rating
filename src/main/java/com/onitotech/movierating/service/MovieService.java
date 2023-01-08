package com.onitotech.movierating.service;

import com.onitotech.movierating.model.Movies;

import java.util.ArrayList;
import java.util.List;

public interface MovieService {



    static List<Movies> getLongestDurationMovies() {
        List<Movies> Movies = new ArrayList<>() ;
        return Movies;
    }

    static List<Movies> getTopRatedMovies() {
        List<Movies> Movies = new ArrayList<>() ;
        return Movies;
    }
    static List<Movies> getNewMovies() {
        List<Movies> Movies = new ArrayList<>() ;
        return Movies;
    }


    static Object saveNewMovies(Movies movies) {
        return null;
    }

}
