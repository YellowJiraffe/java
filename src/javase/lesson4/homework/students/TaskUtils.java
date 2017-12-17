package javase.lesson4.homework.students;

/**
 * Created by Жираф on 23.11.2017.
 */
public class TaskUtils {
    public static void printArr(Student[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        for (Student i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
