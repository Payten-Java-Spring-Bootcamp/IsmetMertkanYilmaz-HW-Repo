package dev.imy.paytenjavaspringbootcamp_hw2.Models;

public enum Genre {
    Action, Comedy, Sci_Fi;

    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    Genre() {

    }

    public String getGenre() {
        return genre;
    }

}
