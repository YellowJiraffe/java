package javase.lesson3.homework.lesson3Task2;

public class TaskUtils {
    public static void printDoubleArray(double[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        for (double i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printIntArray(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
