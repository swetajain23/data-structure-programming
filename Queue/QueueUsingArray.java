package com.impetus.queue;

public class QueueUsingArray {

    int front, rear, size;
    int capacity;
    int array[];

    public QueueUsingArray(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[capacity];
    }
    boolean isFull(QueueUsingArray queue){
        return (queue.size == queue.capacity);
    }
    boolean isEmpty(QueueUsingArray queue){
        return (queue.size == 0);
    }
    void enqueue(int item){
        if(isFull(this))
            return;
        this.rear = (this.rear +1)%this.capacity;
        array[rear] = item;
        size = size + 1;
        System.out.println(item+ " enqueued to queue");
    }
    int dequeue(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        int item = array[front];
        front = front + 1;
        size = size - 1;
        return item;
    }

    int front(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return array[front];
    }
    int rear(){
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.rear];
    }

    public static void main(String[] args){

        QueueUsingArray queue = new QueueUsingArray(100);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() +
                " dequeued from queue\n");

        System.out.println("Front item is " +
                queue.front());

        System.out.println("Rear item is " +
                queue.rear());
    }
}
