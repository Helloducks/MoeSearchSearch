package com.example.moesearchsearch.Models;

import com.google.gson.annotations.SerializedName;

public class AnimeInfo {
    @SerializedName("anilist")
    private AnimeList aniList;
    @SerializedName("filename")
    private String fileName;
    private String episode;
    private String from,to,similarity;
    private String video,image;

    public AnimeList getAniList() {
        return aniList;
    }

    public String getFileName() {
        return fileName;
    }

    public String getEpisode() {
        return episode;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSimilarity() {
        return similarity;
    }

    public String getVideo() {
        return video;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return aniList.toString();
    }

    public String formatedString(){
        return String.format("Episode:%3s |from%12s sec |to%12s sec%nVideoLink:-%s",episode,from,to,video);
    }
}
