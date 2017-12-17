package javase.lesson3.homework.notebook;

/**
 * Created by Жираф on 04.11.2017.
 */
public class Main { public static void main(String[] args) {
    Notebook notebook1 = new Notebook();

    notebook1.add("Hello");
    notebook1.add("World");
    notebook1.add("sdf");

    notebook1.update(2, "New String");

    notebook1.add("jgff");

    notebook1.delete(1);
    notebook1.add("jgffsdgsdgsdg");
    notebook1.add("Oops");

    notebook1.show();

}
}
