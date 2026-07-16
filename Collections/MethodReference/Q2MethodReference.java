package Collections.MethodReference;

public class Q2MethodReference {

    public static void main(String[] args) {

        DigitCountInterface d = DigitCount::digitCount;

        System.out.println("Number of Digits = " + d.count(123456));
    }
}