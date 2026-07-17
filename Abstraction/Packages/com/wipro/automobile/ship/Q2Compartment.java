package com.wipro.automobile.ship;

public class Q2Compartment {

    private int height;
    private int width;
    private int breadth;

    public Q2Compartment(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Breadth : " + breadth);
    }
}