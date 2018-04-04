package javase.lesson7.homework;
// 1 1 2 3 5 8 13 ... Задание на вычисление чисел Фибоначчи: написать 2 разных метода поиска числа Фибоначчи. Рекурсия и Массивы.

public class Fib {
    public static void main(String[] args) {
        System.out.println(fi(45));
        int cache[] = new int[46];
        System.out.println(fib(45, cache));
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
            cache[n] = 1;
        } else {
            cache[n] = fi(n - 1) + fi(n - 2);
        }
        return cache[n];
    }
}


