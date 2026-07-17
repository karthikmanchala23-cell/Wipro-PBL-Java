package Abstraction.InterfaceNewFeatures;

public class Q1Car implements Q1Vehicle, Q1FourWheeler {

    @Override
    public void message() {
        Q1Vehicle.super.message();
    }

    public static void main(String[] args) {

        Q1Car car = new Q1Car();
        car.message();

    }
}