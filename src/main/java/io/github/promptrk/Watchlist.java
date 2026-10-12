package io.github.promptrk;

import java.util.ArrayList;
import java.util.List;

public class Watchlist {
    private List<String> movies = new ArrayList<>();

    public void addMovie(String movie) {
        if (movie != null && !movie.trim().isEmpty()) {
            movies.add(movie.trim());
        }
    }

    public List<String> getMovies() {
        return movies;
    }

    public int getCount() {
        return movies.size();
    }
}
