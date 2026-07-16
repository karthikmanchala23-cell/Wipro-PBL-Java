package Collections.Set;

import java.util.HashSet;

public class Q1CountrySet {

    HashSet<String> H1 = new HashSet<String>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {

        for (String s : H1) {
            if (s.equals(countryName)) {
                return s;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Q1CountrySet obj = new Q1CountrySet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.H1);

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Canada"));
    }
}