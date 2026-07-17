package com.automobile.twowheeler;

import com.automobile.Q3Vehicle;

public class Q3Hero extends Q3Vehicle {

    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP01AB1234";
    }

    public String getOwnerName() {
        return "Karthik";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio facility is available");
    }
}