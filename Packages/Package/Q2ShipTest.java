package Packages.Package;

public class Q2ShipTest {

    public static void main(String[] args) {

        Compartment compartment = new Compartment(10.0, 5.0, 4.0);

        System.out.println("Height : " + compartment.getHeight());
        System.out.println("Width : " + compartment.getWidth());
        System.out.println("Breadth : " + compartment.getBreadth());
        System.out.println("Volume : " + compartment.calculateVolume());
    }
}