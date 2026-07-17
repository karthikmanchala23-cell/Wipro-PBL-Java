package com.automobile.fourwheeler;

import com.automobile.Q3Vehicle;

public class Q4Logan extends Q3Vehicle {

    public String getModelName() {
        return "Logan";
    }

    public String getRegistrationNumber() {
        return "AP11AA1111";
    }

    public String getOwnerName() {
        return "Karthik";
    }

    public int speed() {
        return 120;
    }

    public void gps() {
        System.out.println("GPS facility available");
    }
}