package org.moviestore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.moviestore.model.Movie;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.core.Is.*;

public class MovieStoreTest {
    MovieStore movieStore= new MovieStore();
    Movie harryPorter = new Movie("Harry Potter", "Rowling",1999);
    Movie starWar=new  Movie("Star War","Shwimmer", 2000);
    Movie startTrek = new Movie("Star Trek", "bob", 2001);

    Movie takeThat = new Movie("Take that", "bob", 2002);


    @BeforeEach
    void setUp() {
        movieStore.add(harryPorter);
        movieStore.add(starWar);
        movieStore.add(startTrek);
        movieStore.add(takeThat);
    }

    @Test
    public void returnNoResultsWhenNoTitlesPartiallyMatchSearch() throws Exception{
        List<Movie> results = movieStore.findByPartialTitle("abc");
        assertThat(results.size(),is(0));
    }

    @Test
    public void findResultsWhenTitlesPartiallyMatchSearch() throws Exception{
        List<Movie> results = movieStore.findByPartialTitle("arr");
        assertThat(results.size(),is(1));
        assertThat(results,contains(harryPorter));
    }

    @Test
    public void findResultsWhenDirectorExactMatchSearch1() throws Exception{
        List<Movie> results = movieStore.findByExactDirector("bob");
        assertThat(results.size(),is(2));
        assertThat(results,containsInAnyOrder(takeThat,startTrek));
    }

    @Test
    public void findMovieWhenReleaseYearIsBetweenTwoYears() throws Exception{
        List<Movie> results = movieStore.findByReleaseYear(1999,2002);
        assertThat(results.size(),is(2));
        assertThat(results,containsInAnyOrder(starWar,startTrek));
    }

}