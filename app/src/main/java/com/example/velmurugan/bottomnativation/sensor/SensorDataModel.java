package com.example.velmurugan.bottomnativation.sensor;

import com.google.gson.annotations.SerializedName;

public class SensorDataModel {

    SensorDataModel(String title){
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