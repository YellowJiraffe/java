package javase.lesson5.homework.lists_2;


public class List {
    private Node firsNode;

    public List() {
        firsNode = null;
    }

    public void put(int value) {
        Node newNode = new Node(value, null, null);
        Node prevLastNode = getLastNode();

        if (prevLastNode == null) {
            firsNode = newNode;
        } else {
            prevLastNode.next = newNode;
            newNode.prev = prevLastNode; //движение назад дописала
        }
    }

    public void putInPosition(int value, int index) {
        Node newNode = new Node(value, null, null);
        if (index == 0) {
            newNode.next = firsNode;
            firsNode.prev = newNode;
            firsNode = newNode;
            return;
        }

        Node prevNode = firsNode;
        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.next;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode.next;//обратная ссылка
        prevNode.next = newNode;// добавила
    }

    public Node getFirst() {
        return firsNode;
    }

    private Node getLastNode() {
        if (firsNode == null) {
            return null;
        }

        Node currentNode = firsNode;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void printAllNodes() {
        Node node = getFirst();
        System.out.println(node);
        while (node.next != null) {
            node = node.next;
            System.out.println(node);
        }
    }
}
