package javase.lesson3.homework.lesson3Task2;

/*
 Метод принимает два массива целых чисел и возвращает один массив, состоящий из суммы элементов с одним индексом этих двух массивов.
 Например, массивы на вход:
 [1, 1, 5, 4], [2, 2]
 Результат:
 [3, 3, 5, 4]
 */
public class Task10 {
    public static void main(String args[]) {
        int[] array01 = {3, 5, 7, 9, 7, 5};
        int[] array02 = {4, 6, 7};
        print (GetArr(array01, array02));
    }

    public static int[] GetArr(int arr1[], int arr2[]) {
        int a = 0;
        if (arr1.length > arr2.length) {
            a = arr1.length;
        } else a = arr2.length;
        int[] arr3 = new int[a];
        for (int i = 0; i < a; i++) {
            if (i < arr1.length) {
                arr3[i] += arr1[i];
            }
            if (i < arr2.length) {
                arr3[i] += arr2[i];
            }
        }


 //       for (int i = 0; i < arr1.length; i++) {
        //      arr3[i] = arr1[i];
//        for (int i = 0; i < arr2.length; i++) {
//            arr3[i] = arr3[i] + arr2[i];
//        }

        return arr3;
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
