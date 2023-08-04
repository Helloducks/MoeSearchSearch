package com.example.moesearchsearch.Models;

import com.google.gson.annotations.SerializedName;

public class DifferentTitles {
    @SerializedName("native")
    private String Japanese;
    private String romaji;
    private String english;

    public String getJapanese() {
        return Japanese;
    }

    public String getRomaji() {
        return romaji;
    }

    public String getEnglish() {
        return english;
    }

    @Override
    public String toString() {
        if(english != null){
            return english;
        }else if(romaji != null){
            return romaji;
        }else if(Japanese != null){
            return Japanese;
        }else{
            return "[no Name in Database]";
        }

    }
}
