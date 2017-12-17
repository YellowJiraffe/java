package javase.lesson5.homework.dynamic_array2;

import javase.lesson4.homework.students.Student;

public class SuperArray2 {
    Student[] array;
    int firstEmptyElementIndex;


    public SuperArray2() {
        array = new Student[5];
        firstEmptyElementIndex = 0;
    }

    public int getLength() {
        return firstEmptyElementIndex;
    }

    public Student get(int index) {
        if (index >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];

    }

    public void put(Student element) {
        array[firstEmptyElementIndex] = element;
        firstEmptyElementIndex++;
        if (array.length == firstEmptyElementIndex) {
            Student[] newArray = new Student[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void putByIndex(Student element, int index) {
        System.out.println(array.length);
        if (array.length == firstEmptyElementIndex) {
            Student[] newArray = new Student[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        for (int i = firstEmptyElementIndex - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        firstEmptyElementIndex++;
    }
}
