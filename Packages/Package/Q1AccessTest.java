package Packages.Package;

import Packages.Foundation;

public class Q1AccessTest {

    public static void main(String[] args) {

        Foundation obj = new Foundation();

        
        System.out.println("Default : " + obj.var2);
        System.out.println("Protected : " + obj.var3);
        System.out.println("Public : " + obj.var4);
    }
}