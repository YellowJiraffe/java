package javase.lesson2.homework;
/*
Написать метод, который принимает целое число и выводит на экран сумму всех чисел от 0 до этого числа
 */

public class Task007 {

    public static void main(String args[]) {
        int h = Sum(0);
        System.out.print(h);
    }

    public static int Sum(int a) {
        int sum = 0;

        for (int i = 0; i < a; i++) {
          sum = sum + i;
        }
        return sum;
    }
}


