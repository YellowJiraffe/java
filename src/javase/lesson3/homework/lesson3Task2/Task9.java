package javase.lesson3.homework.lesson3Task2;

/**
 * Метод принимает два массива целых чисел и возвращает тот из них, сумма элементров которого меньше.
 */
public class Task9 {
    public static void main(String args[]) {
        int[] array01 = {3, 5, 7, 9, 7, 5};
        int[] array02 = {4, 6, 7};
       print(GetArr(array01, array02));
    }

    public static int[] GetArr(int[] arr1, int[] arr2) {
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[arr1.length - 1];
        }
        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2 = sum2 + arr2[arr2.length - 1];
        }
        if (sum1 == sum2) {
            return arr1;
        }
        if (sum1 > sum2) {
            return arr2;
        } else return arr1;
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}


