package javase.lesson5.homework.dynamic_array2;

import javase.lesson4.homework.students.Student;


public class Test2 {
    public static void main(String[] args) {
        SuperArray2 array = new SuperArray2();
        Student cleverBoy = new Student("Саша", "Иванов", 1, 2, 4);
        Student cleverGirl = new Student("Саша", "Иванова", 1, 2, 4);
        Student boringGirl = new Student("Катя", "Иванова", 1, 2, 4);
        Student boringBoy = new Student("Гоша", "Иванов", 1, 2, 4);
        Student smilingBoy = new Student("Виктор", "Петров", 1, 2, 4);
        Student smilingGirl = new Student("Соня", "Петрова", 1, 2, 4);
        array.put(cleverBoy);
        array.put(cleverGirl);
        array.put(boringBoy);
        array.put(boringGirl);
        array.put(smilingBoy);
        array.put(smilingGirl);
        System.out.println(array.get(1));
        System.out.println(array.getLength());
        array.putByIndex(boringGirl, 3);
        for (int i = 0; i <= 6; i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}