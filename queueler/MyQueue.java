package queueler;

public class MyQueue {
    private int front, rear,capacity;
    private int[] queue;
    public MyQueue(int queueSize) {
        capacity = queueSize;
        front = -1;
        rear = -1;
        queue = new int[capacity];
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(2);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.dequeue();
        myQueue.printQueue();
        System.out.println("\nKuyruktaki hücre sayısı: "+ myQueue.size() +"\nKuyruk boyutu sayısı: "+ myQueue.capacity);
        System.out.println(myQueue.peek()+" "+myQueue.isEmpty());
    }

    public void enqueue(int data) {
        if (this.size() == capacity) {
            int[] temp = new int[capacity*2];
            for (int i = 0; i < capacity; i++) {
                temp[i] = queue[i];
            }
            queue = temp;
            capacity = capacity *2;
        }
        queue[++rear] = data;
    }

    void dequeue() {
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        queue[rear--] = 0;
    }
    int peek() {
        return queue[front];
    }
    void printQueue() {
        for (int i = 0; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }
    boolean isEmpty() {
        return rear == -1;
    }
    int size(){
        return rear+1;
    }
}
