package Abstraction.InterfaceNewFeatures;

public interface Q1Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }
}