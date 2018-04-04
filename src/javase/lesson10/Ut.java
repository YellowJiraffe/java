package javase.lesson10;

import javase.lesson4.homework.students.Student;

/**
 * Created by Жираф on 08.02.2018.
 */
public class Ut {

        public static void printArr(Countries[] array) {
            if (array == null) {
                System.out.println("null");
                return;
            }

            for (Countries i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


