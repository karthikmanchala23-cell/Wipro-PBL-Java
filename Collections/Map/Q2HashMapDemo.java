package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q2HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");

        // Check key
        System.out.println("Key India exists: " + map.containsKey("India"));

        // Check value
        System.out.println("Value Tokyo exists: " + map.containsValue("Tokyo"));

        // Iterator
        System.out.println("\nHashMap Elements:");

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}