package org.moviestore;

import org.moviestore.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MovieStore {

    List<Movie> movies= new ArrayList<>();

    public List<Movie> findByPartialTitle(String movieName) {
        Predicate predicate= (movie) -> movie.title().toUpperCase().contains(movieName.toUpperCase());
        return findBy(predicate);
    }
    public void add(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> findByExactDirector(String director) {
        Predicate predicate = (movie) -> movie.director().equals(director);
        return findBy(predicate);
    }

    public List<Movie> findByReleaseYear(int fromYear, int toYear) {
        Predicate predicate= (movie) -> movie.release() > fromYear && movie.release()<toYear;
        return findBy(predicate);
    }

    private List<Movie> findBy(Predicate findBy) {
        List<Movie> movieResult=new ArrayList<>();
        for (Movie movie: movies) {
            if(findBy.matches(movie)){
                movieResult.add(movie);
            }
        }
        return movieResult;
    }
    interface Predicate{
        boolean matches(Movie movie);
    }
}
