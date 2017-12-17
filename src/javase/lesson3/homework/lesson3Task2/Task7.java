package javase.lesson3.homework.lesson3Task2;

/**
 * 7. Метод принимает массив и число n и возвращает кол-во элементов, которые больше n.
 */
public class Task7 {
    public static void main(String args[]) {
        int[] array = {5, 6, 7, 8, 9};
        System.out.println(amountOfElements(array, 5));

    }

    public static int amountOfElements(int[] arr, int n) {
        int k = 0;
        for (int element : arr) {
            if (element > n) {
                k++;
            }
        }
        return k;
    }
}
