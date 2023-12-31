public class CircularQueue {
    int capacity;
    int front;
    int rear;
    int[] circularQueue;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        front = -1;
        this.rear = -1;
        circularQueue = new int[capacity];
    }


    void enQueue(int item){
        if (isFull()){
            System.out.println("Circular Queue is Full, no more element can be added!!!");
        } else {
            if (front == -1){
                front = 0;
            }
            rear = (rear + 1) % capacity;
          circularQueue[rear] = item;
            System.out.println("Element "+ item + " is added to the end of the queue at index "+rear);
            printQueue();
        }
    }
    int deQueue(){
        int removedItem = -1;
        if (isEmpty()){
            System.out.println("Circular Queue is empty, hence we cannot remove item!!!");
        } else {
            removedItem =circularQueue[front];
            front = (front + 1) % capacity;
        }
        System.out.println("Element "+removedItem + " is removed..");
        return removedItem;
    }

    boolean isFull(){
        //whenever you find circular operations, do mod operation(%), it always returns remainder value.
        //so x%8 --> 0 to 7
        //queue full condition
        //front==0 and rear==7;
        //front==1 and rear == 0
        //front==2 and rear == 1
        //front==3 and rear==2;
        //front==4 and rear == 3
        //front==5 and rear == 4
        //front==6 and rear==5;
        //front==7 and rear == 6
        //front==0 and rear == 7
        return front % capacity  == ((rear+1) % capacity);
    }

    boolean isEmpty(){
        return front == -1;
    }

    int peek(){
        return circularQueue[front];
    }

    void printQueue() {
        System.out.println("---------" +
                "Queue content is : " +
                "-----------");
        for (int j :circularQueue) {
            System.out.print(j + "\t");
        }
        System.out.println("\n---------------------------------------");
    }

}

