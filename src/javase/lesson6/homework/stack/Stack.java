package javase.lesson6.homework.stack;


import javase.lesson4.homework.students.Student;

public class Stack { //реализация на массиве
    private int mSize; //максимальный размер
    private Student[] stackArray;
    private int top;

    public Stack(int m) {
        this.mSize = m;
        stackArray = new Student[mSize];
        top = -1;
    }

    public void addElement(Student element) {
        stackArray[++top] = element;
    }

    public Student deleteElement() {
        return stackArray[top--];
    }



    public boolean isEmpty() {
        return (top == -1);
    }


}
