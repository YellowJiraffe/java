package javase.lesson1.homework;

public class Task3 {
    public static void main(String[] args) {
        double a = 0; //начало отрезка
        double b = 10; // конец отрезка
        double h = 1; //шаг
        double x = a;
        while (x <= b) {
            System.out.println(Math.tan(2*x)-3);
            x=x+h;
        }
    }
}

