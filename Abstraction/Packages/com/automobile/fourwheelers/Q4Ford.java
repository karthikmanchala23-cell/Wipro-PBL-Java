package com.automobile.fourwheeler;

import com.automobile.Q3Vehicle;

public class Q4Ford extends Q3Vehicle {

    public String getModelName() {
        return "Ford";
    }

    public String getRegistrationNumber() {
        return "TS22BB2222";
    }

    public String getOwnerName() {
        return "Rahul";
    }

    public int speed() {
        return 140;
    }

    public void tempControl() {
        System.out.println("Air Conditioner is working");
    }
}