package com.example.velmurugan.bottomnativation.api;

import com.example.velmurugan.bottomnativation.movies.MovieDataModel;
import com.example.velmurugan.bottomnativation.news.NewsDataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("movies_2017.json")
    Call<List<MovieDataModel>> getshops();

    @GET("movies_2017.json")
    Call<List<NewsDataModel>> getshops1();
}
