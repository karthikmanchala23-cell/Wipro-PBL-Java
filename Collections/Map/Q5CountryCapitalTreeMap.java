package Collections.Map;

import java.util.ArrayList;
import java.util.TreeMap;

public class Q5CountryCapitalTreeMap {

    TreeMap<String, String> M1 = new TreeMap<>();

    TreeMap<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    String getCapital(String country) {
        return M1.get(country);
    }

    String getCountry(String capital) {
        for (String country : M1.keySet()) {
            if (M1.get(country).equals(capital)) {
                return country;
            }
        }
        return null;
    }

    TreeMap<String, String> getReverseMap() {
        TreeMap<String, String> M2 = new TreeMap<>();

        for (String country : M1.keySet()) {
            M2.put(M1.get(country), country);
        }

        return M2;
    }

    ArrayList<String> getCountries() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        Q5CountryCapitalTreeMap obj = new Q5CountryCapitalTreeMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println(obj.M1);
        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.getReverseMap());
        System.out.println(obj.getCountries());
    }
}