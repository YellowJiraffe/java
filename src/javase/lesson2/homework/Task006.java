package javase.lesson2.homework;
/*
Написать программу, выводящую таблицу умножения на 3 (3 * 1 = 3, 3 * 2 = 6 и т.д.)
 */

public class Task006 {

    public static void main(String[] args) {
        for (int i=1; i < 10; i++) {
            System.out.println ("3" + " умножить на " + i + " = " + 3*i);
        }
    }
}