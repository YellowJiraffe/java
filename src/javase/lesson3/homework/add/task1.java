package javase.lesson3.homework.add;

/*Задание 4. Одномерные массивы
Даны действительные числа a1, a2 … an.  Найти Max (a1 + a 2n, a2 + a 2 n-1,…..a n+ a n+1).

 */

import java.util.Random;
public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 3;
        double[] array = new double[2 * n];


        for (int i = 0; i < 2 * n; i++) {
            array[i] = random.nextInt(5);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        double result = getMaxValue(array, n);
        System.out.println(result);
    }

    public static double getMaxValue(double[] a, int n) {
        double maxValue = a[0] + a[2 * n - 1];

        for (int i = 0; i < n; i++) {
            double currentValue = a[i] + a[2 * n - i - 1];

            if (maxValue < currentValue) {
                maxValue = currentValue;
            }
        }
        return maxValue;
    }
}
