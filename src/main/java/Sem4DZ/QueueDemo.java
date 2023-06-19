package Sem4DZ;

import java.util.LinkedList;

public class QueueDemo {
    public static void runDZ2() {
        Queue<Integer> queue = new Queue<>();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Print the queue
        System.out.println("Queue: " + queue);

        // Dequeue an element
        int dequeuedElement = queue.dequeue();
        System.out.println("Dequeued Element: " + dequeuedElement);

        // Print the queue after dequeue
        System.out.println("Queue after Dequeue: " + queue);

        // Get the first element without removing it
        int firstElement = queue.first();
        System.out.println("First Element: " + firstElement);

        // Print the size of the queue
        System.out.println("Queue Size: " + queue.size());

        // Check if the queue is empty
        System.out.println("Is Queue Empty? " + queue.isEmpty());
    }
}

class Queue<T> {
    private LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return queue.removeFirst();
    }

    public T first() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
