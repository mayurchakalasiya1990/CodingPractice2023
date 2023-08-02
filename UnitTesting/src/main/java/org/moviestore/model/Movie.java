package org.moviestore.model;




public class Movie {
    private String name;
    private String director;
    private int release;

    public Movie(String name, String director, int release) {
        this.name=name;
        this.director=director;
        this.release = release;
    }

    public String title() {
        return this.name;
    }

    public String director() {
        return this.director;
    }

    public int release() {
        return this.release;
    }
}
