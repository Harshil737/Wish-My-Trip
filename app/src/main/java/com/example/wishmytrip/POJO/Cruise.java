package com.example.wishmytrip.POJO;

import java.util.Date;

public class Cruise {

    private int id;
    private String title, desc, departing_port, return_port, itinerary, imageURL1, imageURL2, imageURL3;
    private double price;
    private Date departs, returns;
    private int nights;

    public Cruise(int id, String title, String desc, String departing_port, String return_port, String itinerary, String imageURL1, String imageURL2, String imageURL3, double price, Date departs, Date returns, int nights) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.departing_port = departing_port;
        this.return_port = return_port;
        this.itinerary = itinerary;
        this.imageURL1 = imageURL1;
        this.imageURL2 = imageURL2;
        this.imageURL3 = imageURL3;
        this.price = price;
        this.departs = departs;
        this.returns = returns;
        this.nights = nights;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDeparting_port() {
        return departing_port;
    }

    public void setDeparting_port(String departing_port) {
        this.departing_port = departing_port;
    }

    public String getReturn_port() {
        return return_port;
    }

    public void setReturn_port(String return_port) {
        this.return_port = return_port;
    }

    public String getItinerary() {
        return itinerary;
    }

    public void setItinerary(String itinerary) {
        this.itinerary = itinerary;
    }

    public String getImageURL1() {
        return imageURL1;
    }

    public void setImageURL1(String imageURL1) {
        this.imageURL1 = imageURL1;
    }

    public String getImageURL2() {
        return imageURL2;
    }

    public void setImageURL2(String imageURL2) {
        this.imageURL2 = imageURL2;
    }

    public String getImageURL3() {
        return imageURL3;
    }

    public void setImageURL3(String imageURL3) {
        this.imageURL3 = imageURL3;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDeparts() {
        return departs;
    }

    public void setDeparts(Date departs) {
        this.departs = departs;
    }

    public Date getReturns() {
        return returns;
    }

    public void setReturns(Date returns) {
        this.returns = returns;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }
}
