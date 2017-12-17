package javase.lesson3.homework.lesson3Task2;

/*Метод принимает массив целых чисел и целове число n.
 Возвращает n-ый элемент массива или -1, если n выходит за пределы массива.
 */
public class Task1 {
    public static void main(String args[]) {

        int[] array = {3, 5, 7, 9};

        System.out.println(getN(array, 3));
    }

    public static int getN(int[] arr, int n) {
        if (n < arr.length) {
            return arr[n];
        } else {
            return -1;
        }
    }

}

