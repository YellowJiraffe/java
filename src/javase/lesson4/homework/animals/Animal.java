package javase.lesson4.homework.animals;

/**
 * Created by Жираф on 19.11.2017.
 */
public class Animal {
    public int id;
    public int age;
    public String name;

    Animal(int id, int age, String name) {
       this.name = name;
        this.id = id;
        this.age = age;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object b) {
        if (!(b instanceof Animal)) {
            throw new RuntimeException("I don't know, what to do");
        }

        Animal object = (Animal) b;
        if (this.name == object.name && this.id == object.id && this.age == object.age) {
            return true;
        } else {
            return false;
        }
    }
}

