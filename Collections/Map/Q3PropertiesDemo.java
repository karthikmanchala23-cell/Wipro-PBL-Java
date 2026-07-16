package Collections.Map;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Q3PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Karnataka", "Bengaluru");
        p.put("Tamil Nadu", "Chennai");

        Set<Object> keys = p.keySet();
        Iterator<Object> itr = keys.iterator();

        while (itr.hasNext()) {
            Object state = itr.next();
            System.out.println(state + " : " + p.get(state));
        }
    }
}