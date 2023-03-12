package com.example.recyclerview;

public class MovieModel {

    private String name;
    private String rilis;
    private String genre;
    private String duration;
    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRilis() { return rilis; }

    public void setRilis(String rilis) {
        this.rilis = rilis;
    }

    public String getGenre() { return genre; }

    public void setGenre(String genre) { this.genre = genre; }

    public String getDuration() { return duration; }

    public void setDuration(String duration) { this.duration = duration; }

    public int getImage() { return image; }

    public void setImage(int image) {
        this.image = image;
    }
}
