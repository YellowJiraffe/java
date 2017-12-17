package javase.lesson1.homework.add;

import java.util.Random;

public class AdditionalTask {

    public static void main(String[] args) {
        int n = 4;
        int[] array = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);

            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.println("Максимальный элемент массива:");
        System.out.println(getMaxValue(array));


        System.out.println("Минимальный элемент массива:");
        System.out.println(getMinValue(array));

        System.out.println("Среднее значение массива:");
        System.out.println(getAverageValue(array));
        System.out.println("Второе максимальное значение массива:");
        System.out.println(getSecondMaxValue(array));
    }

    public static int getMaxValue(int[] ar) {
        int currentMax = ar[0];

        for (int c : ar) {
            if (currentMax < c) {
                currentMax = c;
            }
        }
        return currentMax;
    }

    public static int getMinValue(int[] array) {
        int currentMin = array[0];
        for (int c : array) {
            if (currentMin > c) {
                currentMin = c;
            }
        }
        return currentMin;
    }

    public static double getAverageValue(int[] array) {

        int sum = 0;

        int n = 0;
        for (int c : array) {
            sum = sum + c;
            n = n + 1;
        }
        return (double) sum / n;
    }

    @SuppressWarnings("Duplicates")
    public static int getSecondMaxValue(int[] ar) {
        int currentMax = ar[0];
        int secondMax = Integer.MIN_VALUE;

        for (int c : ar) {
            if (currentMax < c) {
                currentMax = c;
            }
        }

        for (int c : ar) {
            if (c == currentMax) {
                continue;
            }
            if (secondMax < c) {
                secondMax = c;
            }
        }
        return secondMax;
    }

    @SuppressWarnings("Duplicates")
    public static int getSecondSecondMaxValue(int[] ar) {
        int currentMax = ar[0];
        int secondMax = Integer.MIN_VALUE;

        for (int c : ar) {
            if (currentMax < c) {
                currentMax = c;
            }
        }

        for (int c : ar) {
            if (secondMax < currentMax) {
                secondMax = c;
            }
        }
        return secondMax;
    }
}

