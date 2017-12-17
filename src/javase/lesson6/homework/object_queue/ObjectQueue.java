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

}


//    // Указатель на первый элемент
//    private ObjectBox head = null;
//    // Указатель на последний элемент
//    private ObjectBox tail = null;
//    // Поле для хранения размера очереди
//    private int size = 0;
//
//    public void push(Object obj) {
//        // Сразу создаем вспомогательный объект и помещаем новый элемент в него
//        ObjectBox ob = new ObjectBox();
//        ob.setObject(obj);
//        // Если очередь пустая - в ней еще нет элементов
//        if (head == null) {
//            // Теперь наша голова указывает на наш первый элемент
//            head = ob;
//        } else {
//            // Если это не первый элемент, то надо, чтобы последний элемент в очереди
//            // указывал на вновь прибывший элемент
//            tail.setNext(ob);
//        }
//        // И в любом случае нам надо наш "хвост" переместить на новый элемент
//        // Если это первый элемент, то "голова" и "хвост" будут указывать на один и тот же элемент
//        tail = ob;
//        // Увеличиваем размер нашей очереди
//        size++;
//    }
//
//    public Object pull() {
//        // Если у нас нет элементов, то возвращаем null
//        if (size == 0) {
//            return null;
//        }
//        // Получаем наш объект из вспомогательного класса из "головы"
//        Object obj = head.getObject();
//        // Перемещаем "голову" на следующий элемент
//        head = head.getNext();
//        // Если это был единственный элемент, то head станет равен null
//        // и тогда tail (хвост) тоже дожен указать на null.
//        if (head == null) {
//            tail = null;
//        }
//        // Уменьшаем размер очереди
//        size--;
//        // Возвращаем значение
//        return obj;
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public void printAllQueue() {
//        ObjectBox a = new ObjectBox();
//        System.out.println(a);
//
//    }
//
//
//    // Наш вспомогательный класс будет закрыт от посторонних глаз
//    private class ObjectBox {
//        // Поле для хранения объекта
//        private Object object;
//        // Поле для указания на следующий элемент в цепочке.
//        // Если оно равно NULL - значит это последний элемент
//        private ObjectBox next;
//
//        public Object getObject() {
//            return object;
//        }
//
//        public void setObject(Object object) {
//            this.object = object;
//        }
//
//        public ObjectBox getNext() {
//            return next;
//        }
//
//        public void setNext(ObjectBox next) {
//            this.next = next;
//        }
//    }
//}
