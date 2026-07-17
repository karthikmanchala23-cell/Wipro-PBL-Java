package Abstraction.InterfaceNewFeatures;

public interface Q1FourWheeler {

    default void message() {
        System.out.println("Inside FourWheeler");
    }
}