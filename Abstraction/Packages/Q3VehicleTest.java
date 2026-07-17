import com.automobile.Q3Honda;
import com.automobile.twowheeler.Q3Hero;

public class Q3VehicleTest {

    public static void main(String[] args) {

        Q3Hero hero = new Q3Hero();

        System.out.println("Hero Details");
        System.out.println("Model Name: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner Name: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println();

        Q3Honda honda = new Q3Honda();

        System.out.println("Honda Details");
        System.out.println("Model Name: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner Name: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdPlayer();
    }
}