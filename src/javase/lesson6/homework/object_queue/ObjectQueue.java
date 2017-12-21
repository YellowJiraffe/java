package javase.lesson6.homework.object_queue;

public class ObjectQueue {
    private Node firstNode;

    public ObjectQueue() {
        firstNode = null;
    }

    public void put(int value) {
        Node newNode = new Node(value, null);
        Node prevLastNode = getLastNode();

        if (prevLastNode == null) {
            firstNode = newNode;
        } else {
            prevLastNode.next = newNode;

        }
    }

    public Node pop() {
        Node prevLastNode = getPrevLastNode();
        Node lastLode = getLastNode();
        if (prevLastNode == null) {
            firstNode = null;
        } else {
            prevLastNode.next = null;
        }
        return lastLode;
    }

    public Node getFirst() {
        return firstNode;
    }

    public void push(int value) {
        Node newNode = new Node(value, null);
        newNode.next = firstNode;
        firstNode = newNode;
    }

    private Node getLastNode() {
        if (firstNode == null) {
            return null;
        }

        Node currentNode = firstNode;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public Node getPrevLastNode() {
        if (firstNode == null) {
            return null;
        }
        Node prevLastNode = getLastNode();
        Node currentNode = firstNode;
        if (firstNode.next == null) {
            return null;
        }
        while (currentNode.next != prevLastNode) {
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

    public boolean isEmpty() {
        if (firstNode == null) {
            return true;
        }
        return false;
    }
}

