package javase.lesson5.homework.lists_2;


public class Node {
    public int value;
    public Node next;
    public Node prev;

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return "Значение: " + value + "; Ссылка null? " + (next == null);
    }
}
