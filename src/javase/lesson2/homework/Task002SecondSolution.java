package javase.lesson2.homework;

/*Написать метод, выводящий на экран ближайшее к 10 число. Метод принимает два числа.
 */
public class Task002SecondSolution {
    public static void main(String[] args) {

        System.out.println(getCloseNumber(-1, -5));
    }


    public static int getCloseNumber(int n, int m) {
        int i = 10;
        int k = Math.abs(i - m);
        int c = Math.abs(i - n);
        if (k == c) {
            return n;
        }
        if (k < c) {
            return m;
        }

        return n;
    }
}
