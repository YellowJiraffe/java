package javase.lesson2.homework;

/*Написать программу, выводящую на экран все чётные числа от 1 до 100, которые кратны 3 (например 6)
 */
public class Task005 {
    public static void main(String[] args) {
        for (int i = 6; i< 100; i = i + 6){
            System.out.print(i + " ");
        }
    }
}
