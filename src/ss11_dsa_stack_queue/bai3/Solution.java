package ss11_dsa_stack_queue.bai3;

public class Solution {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);

        System.out.println("Initial Queue:");
        queue.displayQueue();

        System.out.println("Dequeuing element: " + queue.deQueue());
        System.out.println("Dequeuing element: " + queue.deQueue());

        System.out.println("Queue after dequeue:");
        queue.displayQueue();
    }
}
