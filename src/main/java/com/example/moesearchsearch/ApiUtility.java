package com.example.moesearchsearch;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.example.moesearchsearch.Models.ApiResponce;
import com.google.gson.Gson;

public class ApiUtility {
    public static ApiResponce getDataFromAPI(String searchURL){
        searchURL = searchURL.replace(" ","%20");
        String finalURL = "https://api.trace.moe/search?anilistInfo&url="+ searchURL;
        System.out.println(finalURL);
        Gson gson = new Gson();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(finalURL)).build();
        try{
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse
                    .BodyHandlers
                    .ofString());
                return gson.fromJson(response.body(), ApiResponce.class);

        }catch(Exception e){
            e.printStackTrace();
        }


        return null;
    }
}
