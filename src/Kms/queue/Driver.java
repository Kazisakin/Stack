package Kms.queue;

public class Driver {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.print("Current queue: ");
        queue.display();

        System.out.println("Front element (peek): " + queue.peek());

        System.out.println("Dequeuing element: " + queue.dequeue());
        System.out.print("Queue after dequeue: ");
        queue.display();

        System.out.println("Current size of the queue: " + queue.size());

        System.out.println("Dequeuing elements: " + queue.dequeue() + ", " + queue.dequeue());
        System.out.print("Queue after dequeues: ");
        queue.display();

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
