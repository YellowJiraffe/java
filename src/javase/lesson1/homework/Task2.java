package javase.lesson1.homework;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            double a = (1 / (((double) i + 1) * (i + 1)));
            if (a < 0.01) {
                System.out.println(a);
            }
        }
    }
}

