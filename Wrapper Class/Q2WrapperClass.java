package WrapperClass;

public class Q2WrapperClass {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please provide one integer as command line argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);

        System.out.println("Given Number : " + num);
        System.out.println("Binary equivalent : " + Integer.toBinaryString(num));
        System.out.println("Octal equivalent : " + Integer.toOctalString(num));
        System.out.println("Hexadecimal equivalent : " + Integer.toHexString(num).toUpperCase());
    }
}