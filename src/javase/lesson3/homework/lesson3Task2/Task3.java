package javase.lesson3.homework.lesson3Task2;

/*Метод принимает массив целых числе и ещё одно число n.
 Возвращает другой массив, в котором все элементы первого массива, которые меньше числа n.
 */
public class Task3 {
    public static void main(String args[]) {
        int[] array = {5, 8, 6};
        TaskUtils.printIntArray(getArr(array, 55));
    }

    public static int[] getArr(int[] arr, int n) {
        int k = 0;
        for (int element : arr) {
            if (element < n) {
                k++;
            }

        }
        int array1[] = new int[k];
        int t = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] < n) {
                array1[t] = arr[i];
                t++;
            }
        }

        return array1;
    }
}