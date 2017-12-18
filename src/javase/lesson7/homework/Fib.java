package javase.lesson7.homework;
// 1 1 2 3 5 8 13 ... Задание на вычисление чисел Фибоначчи: написать 2 разных метода поиска числа Фибоначчи. Рекурсия и Массивы.

public class Fib {
    public static void main(String[] args) {
        System.out.println(fi(2));
        System.out.println(fib(2));
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

    public static int fib(int n) {
        int cache[] = new int[n+1];
        if (cache[n] == 0) {
            if (n <= 0) {
                return 0;
            }
            if (n == 1 || n == 2) {
                cache[n] = 1;
            } else {
                cache[n] = fib(n - 1) + fib(n - 2);
            }
        }

        return cache[n];
    }
}


