package com.example.wishmytrip.ui.orderhistory;

public class Order {

    private String fromplace,tooplace,fromdate,toodate,cruiseship,cruiseline,pricerange,image;

    public Order(String image, String fromdate,String cruiseship, String cruiseline, String pricerange) {
        this.fromplace = fromplace;
        this.tooplace = tooplace;
        this.fromdate = fromdate;
        this.toodate = toodate;
        this.cruiseship = cruiseship;
        this.cruiseline = cruiseline;
        this.pricerange = pricerange;
        this.image = image;
    }

    public String getFromplace() {
        return fromplace;
    }

    public void setFromplace(String fromplace) {
        this.fromplace = fromplace;
    }

    public String getTooplace() {
        return tooplace;
    }

    public void setTooplace(String tooplace) {
        this.tooplace = tooplace;
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getToodate() {
        return toodate;
    }

    public void setToodate(String toodate) {
        this.toodate = toodate;
    }

    public String getCruiseship() {
        return cruiseship;
    }

    public void setCruiseship(String cruiseship) {
        this.cruiseship = cruiseship;
    }

    public String getCruiseline() {
        return cruiseline;
    }

    public void setCruiseline(String cruiseline) {
        this.cruiseline = cruiseline;
    }

    public String getPricerange() {
        return pricerange;
    }

    public void setPricerange(String pricerange) {
        this.pricerange = pricerange;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
