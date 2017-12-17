package javase.lesson5.homework.lists_2;


public class Test {
    public static void main (String [] args){
        List newList = new List ();
        newList.put (7);
        newList.put (5);
        newList.put (6);
        newList.putInPosition(4,0);
        newList.putInPosition(4,1);
        newList.put(1243123);
        newList.printAllNodes();
    }
}
