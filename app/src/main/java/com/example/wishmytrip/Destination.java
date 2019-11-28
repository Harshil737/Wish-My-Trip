package com.example.wishmytrip;

public class Destination {
    private int id;
    private String imageURL;
    private String title;
    private String description;
    private Double price;

    Destination() {
    }

    public Destination(int id, String imageURL, String title, String description, Double price) {
        this.id = id;
        this.imageURL = imageURL;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
