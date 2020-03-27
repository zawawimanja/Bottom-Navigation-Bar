package com.example.velmurugan.bottomnativation.listProject;

import com.google.gson.annotations.SerializedName;

public class ListDataModel {

    ListDataModel(String title){
        this.title=title;
    }

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

                '}';
    }
}