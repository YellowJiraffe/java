package javase.lesson3.homework.lesson3task1;

/*Создай программу, выполняющая последовательно:
- создаёт массив чётных чисел от 0 до 100
- умножает каждый элемент массива, чей номер чётный - на 2, а нечётный - на 3
- создаёт другой массив, в котором записываются все значения из предыдущего массива, но с конца
 */
public class Task2AnotherArray {
    public static void main(String args[]) {
        int[] array = new int[5];
        int n = 0;
        for (int i = 0; i < array.length * 2; i = i + 2) {
            array[n] = i;


            if (n % 2 == 0) {
                array[n] = i * 2;

            } else {
                array[n] = i * 3;
            }
            n++;
        }


        print(array);

        int[] array2 = new int[5];
        int a = 0;
        for (int i = array.length - 1; i >= 0; i = i - 1) {
            array2[a] = array[i];
            a++;

        }


        print(array2);
    }

    public static void print(int[] m) {
        for (int i : m) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

