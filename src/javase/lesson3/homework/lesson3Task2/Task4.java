package javase.lesson3.homework.lesson3Task2;

/*Метод принимает массив целых чисел и возвращает массив, в котором элементы первого в обратном порядке.
 */
public class Task4 {
    public static void main(String args[]) {

        int[] array = {3, 5, 7, 9, 7, 5};

        print(array);
        print(getArr(array));
    }
    public static int[] getArr(int[] arr) {
        int[] array1 = new int[arr.length];
        int k = 0;
        for (int i = array1.length - 1; i >= 0; i = i - 1) {
            array1[k] = arr[i];
            k++;
        }
        return (array1);
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}


