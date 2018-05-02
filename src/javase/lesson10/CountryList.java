package javase.lesson10;

import java.util.ArrayList;

/**
 * Created by Жираф on 01.05.2018.
 */
public class CountryList {
    public CountryList() {
        this.countries = new ArrayList<>();
    }

    public static void main(String args[]) {
        CountryList country = new CountryList();
        country.add("Россия", "русский", "рубль", 12);
        country.add("Украина", "украинский", "гривна", 12);
        country.add("Венгрия", "венгерский", "форинт", 12);
        country.print();
        System.out.println(country.check("Украина"));
        country.remove("Украина");
        country.print();
        System.out.println(country.currency("рубль"));
        System.out.println(country.language("венгерский"));
    }

    public ArrayList<Country> countries;


    public void add(String name, String language, String currency, int population) {
        Country country = new Country(name, language, currency, population);
        countries.add(country);
    }

    public boolean check(String name) {
        for (Country a : countries) {
            if (a.name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void remove(String name) {
        ArrayList<Country> removeList = new ArrayList<Country>();

        for (Country a : countries) {
            if (a.name.equals(name)) {
                removeList.add(a);

            }
        }
        for (Country a : removeList) {
            countries.remove(a);
        }
    }

    public ArrayList<Country> currency(String currency) {
        ArrayList<Country> currencyList = new ArrayList<Country>();

        for (Country a : countries) {
            if (a.currency.equals(currency)) {
                currencyList.add(a);

            }
        }
        return currencyList;
    }

    public ArrayList<Country> language(String language) {
        ArrayList<Country> langList = new ArrayList<Country>();

        for (Country a : countries) {
            if (a.language.equals(language)) {
                langList.add(a);
            }
        }
        return langList;
    }

    public void print() {
        for (Country a : countries) {
            System.out.println(a);
        }

    }
}
