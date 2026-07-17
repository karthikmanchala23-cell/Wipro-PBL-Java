import com.automobile.fourwheeler.Q4Ford;
import com.automobile.fourwheeler.Q4Logan;

public class Q4Test {

    public static void main(String[] args) {

        Q4Logan logan = new Q4Logan();

        System.out.println("Logan Details");
        System.out.println(logan.getModelName());
        System.out.println(logan.getRegistrationNumber());
        System.out.println(logan.getOwnerName());
        System.out.println("Speed : " + logan.speed());
        logan.gps();

        System.out.println();

        Q4Ford ford = new Q4Ford();

        System.out.println("Ford Details");
        System.out.println(ford.getModelName());
        System.out.println(ford.getRegistrationNumber());
        System.out.println(ford.getOwnerName());
        System.out.println("Speed : " + ford.speed());
        ford.tempControl();
    }
}