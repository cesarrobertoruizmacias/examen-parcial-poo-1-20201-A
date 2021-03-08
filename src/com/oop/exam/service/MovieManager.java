package com.oop.exam.service;

import com.oop.exam.model.Movie;

import java.util.LinkedList;

public class MovieManager {
    private LinkedList<Movie> movies;

    public MovieManager() {
        this.movies = new LinkedList<>();
    }

    public LinkedList<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public Movie findMovie(String name){
        int i;
        for(i=0;i< movies.size();i++)
        {
            if(movies.get(i).getTitle() == name ) {
                return movies.get(i);
            }
        }
        return null;
    }


}
