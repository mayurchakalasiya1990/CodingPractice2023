package org.moviestore;

import org.junit.jupiter.api.Test;
import org.moviestore.model.Movie;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.Is.*;

public class MovieStoreTest {

    @Test
    public void returnNoResultsWhenNoTitlesPartiallyMatchSearch() throws Exception{
        MovieStore movieStore= new MovieStore();
        List<Movie> results = movieStore.findByPartialTitle("abc");
        assertThat(results.size(),is(0));
    }

    @Test
    public void findResultsWhenTitlesPartiallyMatchSearch() throws Exception{
        MovieStore movieStore= new MovieStore();
        Movie harryPorter = new Movie("Harry Potter");
        movieStore.add(harryPorter);
        movieStore.add(new Movie("Star War"));
        movieStore.add(new Movie("Star Trek"));
        List<Movie> results = movieStore.findByPartialTitle("arr");
        assertThat(results.size(),is(1));
        assertThat(results,contains(harryPorter));
    }

    @Test
    public void findResultsWhenTitlesPartiallyMatchSearch1() throws Exception{
        MovieStore movieStore= new MovieStore();
        Movie harryPorter = new Movie("Harry Potter");
        movieStore.add(harryPorter);
        movieStore.add(new Movie("Star War"));
        movieStore.add(new Movie("Star Trek"));
        List<Movie> results = movieStore.findByPartialTitle("arr");
        assertThat(results.size(),is(1));
        assertThat(results,contains(harryPorter));
    }


}