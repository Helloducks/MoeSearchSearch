package com.example.moesearchsearch.Models;

public class ApiResponce {
    private int frameCount;
    private String error;
    private AnimeInfo[] result;

    public int getFrameCount() {
        return frameCount;
    }

    public String getError() {
        return error;
    }

    public AnimeInfo[] getResults() {
        return result;
    }
}
