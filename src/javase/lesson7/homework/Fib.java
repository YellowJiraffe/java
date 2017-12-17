package javase.lesson7.homework;
// 1 1 2 3 5 8 13 ... Задание на вычисление чисел Фибоначчи: написать 2 разных метода поиска числа Фибоначчи. Рекурсия и Массивы.

public class Fib {
    public static void main(String[] args) {
        System.out.println(Fi(30));
        System.out.println(Fib(30));
    }

    public static int Fi(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fi(n - 1) + Fi(n - 2);
        }
    }

    public static int Fib(int n) {
        int cache[] = new int[50];

        {
            if (cache[n] == 0) {
                if (n == 1 || n == 2) {
                    cache[n] = 1;
                } else {
                    cache[n] = Fib(n - 1) + Fib(n - 2);
                }
            }

            return cache[n];
        }
    }
}

