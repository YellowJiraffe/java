package javase.lesson7.homework;
// 1 1 2 3 5 8 13 ... Задание на вычисление чисел Фибоначчи: написать 2 разных метода поиска числа Фибоначчи. Рекурсия и Массивы.

import java.util.Arrays;

public class Fib {
    public static void main(String[] args) {
//        System.out.println(fi(15));
        int cache[] = new int[5];

        System.out.println(fib(4, cache));
        System.out.println(Arrays.toString(cache));
    }

    public static int fi(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fi(n - 1) + fi(n - 2);
        }
    }

    public static int fib(int n, int[] cache) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int x;
        if (cache[n] != 0) {

            return cache[n];


        } else {
            x = fib(n - 1, cache) + fib(n - 2, cache);
            System.out.println(Arrays.toString(cache));
            cache[n] = x;
            return cache[n];
        }
    }
}


