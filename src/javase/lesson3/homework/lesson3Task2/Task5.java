package javase.lesson3.homework.lesson3Task2;


/*Метод принимает два массива целых чисел и возвращает один массив,
 в котором сначала элементы первого, затем элементы второго.
 */
public class Task5 {
    public static void main(String args[]) {

        int[] array1 = {3, 5, 7, 9, 7, 5};
        int[] array2 = {4, 6, 7};

        print(getArr(array1, array2));
    }

    public static int[] getArr(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2 [i];
        }


        return arr3;
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}