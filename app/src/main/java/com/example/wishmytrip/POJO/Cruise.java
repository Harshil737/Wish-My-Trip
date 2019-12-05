package com.example.wishmytrip.POJO;

public class Cruise {

    int id;
    private String title, desc;
    private double price;
    private int image;

    public Cruise(int id, String title, String desc, double price, int image) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
