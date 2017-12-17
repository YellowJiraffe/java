package javase.lesson7.homework;


import javase.lesson5.homework.dynamic_array.SuperArray;


// написать сортировку пузырьком для твоего собственного List (динамический массив). То есть метод сортировки принимает List/
public class Bubble {
    public static void main(String[] args) {
        SuperArray arr = new SuperArray();
        arr.putToEnd(6);
        arr.putToEnd(4);
        arr.putToEnd(7);
        arr.putToEnd(2);
        arr.putToEnd(5);
        arr.putToEnd(9);
        for (int i = 0; i < arr.getLength(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println(arr.getLength());
        System.out.println();
        bubbleSort(arr);
        System.out.println();
        System.out.println(arr.getLength());
        System.out.println();
        for (int i = 0; i < arr.getLength(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }


    public static void bubbleSort(SuperArray arr) {
        for (int i = arr.getLength() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    swap(arr, j, j+1);
//                    arr.putByIndex((arr.get(j)),j+1);
//                    arr.putByIndex((arr.get(j+1)),j);
                    //arr.get(j) = arr.get(j + 1);
                    //arr.get(j + 1) = tmp;
                }
            }
        }
    }

    public static void swap(SuperArray array, int posA, int posB) {
        int a = array.get(posA);
        int b = array.get(posB);
        array.put(a, posB);
        array.put(b, posA);

    }
}
