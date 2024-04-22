package ss11_dsa_stack_queue.bai3;

public class Queue {
    //[Bài tập] Triển khai Queue sử dụng danh sách liên kết vòng
    Node front;
    Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = newNode;
        } else {
            rear.link = newNode;
        }
        rear = newNode;
        rear.link = front;
    }

    public int deQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int value;
        if (front == rear) {
            value = front.data;
            front = null;
            rear = null;
        } else {
            Node temp = front;
            value = temp.data;
            front = front.link;
            rear.link = front;
        }
        return value;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != front);
        System.out.println();
    }
}
