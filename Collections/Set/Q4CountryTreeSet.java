package Collections.Set;

import java.util.TreeSet;

public class Q4CountryTreeSet {

    TreeSet<String> countries = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        countries.add(countryName);
        return countries;
    }

    public String getCountry(String countryName) {

        if (countries.contains(countryName)) {
            return countryName;
        }

        return null;
    }

    public static void main(String[] args) {

        Q4CountryTreeSet obj = new Q4CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");
        obj.saveCountryNames("Canada");

        System.out.println("Countries : " + obj.countries);

        System.out.println("\nSearch Result:");

        System.out.println("India : " + obj.getCountry("India"));
        System.out.println("Germany : " + obj.getCountry("Germany"));
    }
}