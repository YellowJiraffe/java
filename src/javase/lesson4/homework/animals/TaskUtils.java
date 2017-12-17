package javase.lesson4.homework.animals;

/**
 * Created by Жираф on 19.11.2017.
 */
public class TaskUtils {
    public static void printArr(Animal[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        for (Animal i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
