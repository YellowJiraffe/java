package javase.lesson6.homework.object_queue;


public class QueueTest {
    public static void main(String[] args) {
        ObjectQueue newQueue = new ObjectQueue();
        newQueue.push(5);
        newQueue.push(2);
        newQueue.push(1);
        System.out.println(newQueue.pop());
        System.out.println(newQueue.pop());
        System.out.println(newQueue.pop());
        System.out.println(newQueue.pop());
        System.out.println(newQueue.pop());
        System.out.println(newQueue.pop());
        System.out.println(newQueue.pop());
    }
}


