package javase.lesson2.homework;

/*Создать метод, который выводит на экран является ли число чётным или нечётным
 */
public class Task001 {
    public static void main(String args[]) {
        int h = EvenOdd(-9545);
        System.out.print(h);
    }

    public static int EvenOdd(int a) {
        System.out.print("Число " + a + " ");
        if (a % 2 == 0) {
            System.out.println("чётное");
        } else {
            System.out.println("нечётное");
        }
        return a;
    }
}


