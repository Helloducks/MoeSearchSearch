package com.example.moesearchsearch.Models;

public class AnimeList {
    private String id,idMal,isAdult;
    private String[] synonyms;

    private DifferentTitles title;

    public DifferentTitles getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title.toString();
    }
}
