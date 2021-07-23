package com.example.myapplication;

public class Item {
    String name,price,extra;

    public Item(String name, String price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }


}
