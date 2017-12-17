package javase.lesson5.homework.dynamic_array;


public class Test {


    public static void main(String[] args) {
        SuperArray array = new SuperArray();
        array.putToEnd(5);
        array.putToEnd(4);
        array.putToEnd(7);
        array.putToEnd(5);
        array.putToEnd(5);
        array.putToEnd(5);
        System.out.println(array.get(1));
        System.out.println(array.getLength());
        array.putByIndex(6,3);
        for (int i = 0; i <=6; i++){
            System.out.print(array.get(i) + " ");
        }


    }
}




