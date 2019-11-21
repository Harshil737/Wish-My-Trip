package com.example.wishmytrip;

public class Cruise {

    int id;
    private String title, desc;
    private double price;
    private int image;

    Cruise(int id, String title, String desc, double price, int image) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    String getTitle() {
        return title;
    }

    String getDesc() {
        return desc;
    }

    double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
