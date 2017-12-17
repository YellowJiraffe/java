package javase.lesson4.homework.students;

/**
 * Created by Жираф on 24.11.2017.
 */
public class TaskUtils2 {
    public static void printStudentArray(Student[] array) {
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
