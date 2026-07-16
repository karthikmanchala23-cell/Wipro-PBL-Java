package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Q1CountryCapitalMap {

    HashMap<String, String> M1 = new HashMap<>();

    // Save country and capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // Get capital from country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // Get country from capital
    public String getCountry(String capitalName) {
        for (String country : M1.keySet()) {
            if (M1.get(country).equals(capitalName)) {
                return country;
            }
        }
        return null;
    }

    // Create another map with Capital as key and Country as value
    public HashMap<String, String> swapKeyValue() {

        HashMap<String, String> M2 = new HashMap<>();

        for (String country : M1.keySet()) {
            M2.put(M1.get(country), country);
        }

        return M2;
    }

    // Get all country names
    public ArrayList<String> toArrayList() {

        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }

    public static void main(String[] args) {

        Q1CountryCapitalMap obj = new Q1CountryCapitalMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("Australia", "Canberra");

        System.out.println("Map M1 : " + obj.M1);

        System.out.println("Capital of India : " + obj.getCapital("India"));

        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println("Map M2 : " + obj.swapKeyValue());

        System.out.println("Country List : " + obj.toArrayList());
    }
}