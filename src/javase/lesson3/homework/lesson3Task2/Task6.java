package javase.lesson3.homework.lesson3Task2;

/*Метод принимает массив и возвращает его длину
 */
public class Task6 {

    public static void main(String args[]) {

        int[] array = {3, 5, 7, 9};
        int length = lengthArray(array);
        System.out.println(length);

    }

    public static int lengthArray(int[] arr) {
        return arr.length;
    }

}
