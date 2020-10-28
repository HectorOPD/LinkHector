package com.example.linkhector;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int id;
    private int userId;
    private String title;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    @SerializedName("Body")
    private String text;



}
