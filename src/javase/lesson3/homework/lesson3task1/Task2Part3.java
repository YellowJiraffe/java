package javase.lesson3.homework.lesson3task1;

import java.util.Random;

/**
 * Created by Жираф on 05.11.2017.
 */
public class Task2Part3 {
    public static void main(String[] args) {
        int n = 5;

        int[] array = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10);
        }

        print(array);
        // ...............

        int[] array2 = new int[n];
        int k = 0;
        for (int i = array2.length - 1; i >= 0; i = i - 1) {
          array2[k] = array [i];
            k++;
        }

        print (array2);
    }


    public static void print(int[] m) {
        for (int i : m) {
            System.out.print(i + " ");
        }
        System.out.println();

    }


}
