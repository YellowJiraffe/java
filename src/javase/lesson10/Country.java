package javase.lesson10;

import java.util.ArrayList;

/**
 * Created by Жираф on 08.02.2018.
 */
public class Country {
    public String name;
    public String language;
    public String currency;
    public int population;

    public Country(String name, String language, String currency, int population) {
        this.name = name;
        this.language = language;
        this.currency = currency;
        this.population = population;
    }

    public String toString() {
        return name + " " + language + " " + currency + " " + population;
    }

    @Override
    public boolean equals(Object b) {
        if (!(b instanceof Country)) {
            throw new RuntimeException("I don't know, what to do");
        }

        Country object = (Country) b;
        return this.name.equals(object.name) && this.language.equals(object.language) &&
                this.currency == object.currency && this.population == object.population;
    }
}

