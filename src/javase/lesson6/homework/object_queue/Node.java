package javase.lesson6.homework.object_queue;

/**
 * Created by Жираф on 03.12.2017.
 */
public class Node {
    public int value;
    public Node next;


    public Node(int value, Node next) {
        this.value = value;
        this.next = null;

    }

    @Override
    public String toString() {
        return "Значение: " + value + "; Ссылка null? " + (next == null);
    }
}



