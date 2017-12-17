package javase.lesson2.homework;

/*Написать метод, выводящий на экран ближайшее к 10 число. Метод принимает два числа.
 */

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число больше деяти: ");
        Scanner a = new Scanner(System.in);
        int m = a.nextInt();
        System.out.print("Введите любое целое число больше десяти: ");
        int n = a.nextInt();
        int i = 10;
        int k = Math.abs(i - m);
        System.out.println(k);
        int c = Math.abs(i - n);
        System.out.println(c);
        if (k == c) {
            System.out.println("Числа " + n + " и " + m + " равноудалены от " + i);
        }
        if (k < c) {
            System.out.println("Число " + m + " ближе к " + i);
        }
        if (k > c) {
            System.out.println("Число " + n + " ближе к " + i);
        }
    }
}


