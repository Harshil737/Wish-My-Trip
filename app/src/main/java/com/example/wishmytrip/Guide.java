package com.example.wishmytrip;

public class Guide {
    int id;
    private String name, phonenno;

    private int image;

    Guide()
    {}

    public Guide(int id, String name, String phoneno, int image) {
        this.id = id;
        this.name = name;
        this.phonenno = phoneno;

        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenno() {
        return phonenno;
    }

    public void setPhonenno(String phonenno) {
        this.phonenno = phonenno;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
