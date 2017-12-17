package javase.lesson3.homework.lesson3Task2;

/*Метод принимает массив дробных чисел и целове число n.
 Возвращает другой массив, включающий в себя все элементы с n-ого и до конца первого массива.
 Если это невозможно - метод возвращает null.
 */
public class Task2 {
    public static void main(String args[]) {
        double[] arr1 = {1, 2};
        TaskUtils.printDoubleArray(getArr(arr1, 1));
    }

    public static double[] getArr(double[] arr, int n) {
        if (n > arr.length - 1) {
            return null;
        }
        double[] array = new double[arr.length - n];
        int k = 0;
        for (int i = n; i < arr.length; i++) {
            array[k] = arr[i];
            k++;
        }
        return array;


    }
}




