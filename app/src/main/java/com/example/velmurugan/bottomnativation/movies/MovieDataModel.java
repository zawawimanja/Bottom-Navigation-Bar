package com.example.velmurugan.bottomnativation.movies;

import com.google.gson.annotations.SerializedName;

public class MovieDataModel {

    @SerializedName("id")
    public String id;
    @SerializedName("title")
    public String title;
    @SerializedName("image")
    public String image;

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
