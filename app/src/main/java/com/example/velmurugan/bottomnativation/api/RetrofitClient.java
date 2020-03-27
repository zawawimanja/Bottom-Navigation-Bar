package com.example.velmurugan.bottomnativation.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static retrofit2.Retrofit retrofit = null;

    public static retrofit2.Retrofit getInstance(){
        retrofit = new retrofit2.Retrofit.Builder().baseUrl("https://api.androidhive.info/json/").addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }

    public static retrofit2.Retrofit getInstance1(){
        retrofit = new retrofit2.Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/").addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
