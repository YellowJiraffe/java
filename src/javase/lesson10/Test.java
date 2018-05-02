package javase.lesson10;

/**
 * Created by Жираф on 02.05.2018.
 */
public class Test {
    public String name() {
        return "A";
    }

    public String name;


    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.name);
        System.out.println(test.name());
    }

}
