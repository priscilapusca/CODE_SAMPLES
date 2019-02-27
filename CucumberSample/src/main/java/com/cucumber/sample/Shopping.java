package com.cucumber.sample;

public class Shopping {

    private String name;
    private float price;

    Shopping(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
