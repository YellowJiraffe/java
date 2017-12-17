package javase.lesson5.homework.dynamic_array;

public class SuperArray {
    int[] array;
    int firstEmptyElementIndex;


    public SuperArray() {
        array = new int[5];
        firstEmptyElementIndex = 0;
    }

    public int getLength() {
        return firstEmptyElementIndex;
    }

    public int get(int index) {
        if (index >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];

    }

    public void putToEnd(int element) {
        array[firstEmptyElementIndex] = element;
        firstEmptyElementIndex++;
        if (array.length == firstEmptyElementIndex) {
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void putByIndex(int element, int index) {
        if (array.length == firstEmptyElementIndex) {
            int[] newArray = new int[array.length * 2];
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

    public void put(int element, int index) {
        array[index] = element;
    }
}



