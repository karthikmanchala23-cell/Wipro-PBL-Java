package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q4ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Karthik", 987654321);
        contacts.put("Rahul", 987654322);
        contacts.put("Priya", 987654323);
        contacts.put("Anitha", 987654324);

        // Check key
        System.out.println("Contains Karthik : "
                + contacts.containsKey("Karthik"));

        // Check value
        System.out.println("Contains 987654323 : "
                + contacts.containsValue(987654323));

        // Display using Iterator
        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> itr =
                contacts.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}