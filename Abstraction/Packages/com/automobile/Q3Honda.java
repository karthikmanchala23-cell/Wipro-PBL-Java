package com.automobile;

public class Q3Honda extends Q3Vehicle {

    public String getModelName() {
        return "Honda City";
    }

    public String getRegistrationNumber() {
        return "TS02CD5678";
    }

    public String getOwnerName() {
        return "Rahul";
    }

    public int getSpeed() {
        return 120;
    }

    public void cdPlayer() {
        System.out.println("CD Player facility is available");
    }
}