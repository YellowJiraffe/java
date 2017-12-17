package javase.lesson6.homework.stack;

import javase.lesson4.homework.students.Student;


public class StackTest {
    public static void main(String[] args) {
        Stack mStack = new Stack(55);
        Student cleverBoy = new Student("Саша", "Иванов", 1, 2, 4);
        Student cleverGirl = new Student("Саша", "Иванова", 1, 2, 4);
        Student boringGirl = new Student("Катя", "Иванова", 1, 2, 4);
        Student boringBoy = new Student("Гоша", "Иванов", 1, 2, 4);
        mStack.addElement(cleverBoy);
        mStack.addElement(cleverGirl);
        mStack.addElement(boringGirl);
        mStack.addElement(boringBoy);

        System.out.print("Стек: ");
        while (!mStack.isEmpty()) {
            Student value = mStack.deleteElement();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
