package services;

import models.Movie;

import java.util.ArrayList;
import java.util.List;

// only to the admin
public class MovieService {

    List<Movie> movies;

    public MovieService() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(String name, float rating, String date) {
        if (findByName(name) != null) throw new RuntimeException("Movie already exists.");
        movies.add(new Movie(name, rating, date));
    }

    public List<Movie> getMovies() {
        return movies;
    }

    // search functionalities
    public Movie findByName(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) return movie;
        }
        return null;
    }

    public Movie findById(int movieId) {
        for (Movie movie : movies) {
            if (movie.getMovieId() == (movieId)) return movie;
        }
        return null;
    }

}
