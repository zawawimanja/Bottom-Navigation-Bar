package com.example.velmurugan.bottomnativation.news;

import com.google.gson.annotations.SerializedName;

public class NewsDataModel {

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
