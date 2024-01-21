public class Queue {

    int data[];
    int front;
    int rear;
    
    public Queue(int size){
        data = new int[size];
        front = 0;
        rear = -1;
    }

    public Queue(){
        this(10);
    }

    public boolean isEmpty(){
        return rear < front;
    }

    public boolean isFull(){
        return rear == data.length - 1;
    }

    public void enqueue(int value){
        if (this.isFull()) {
            System.out.println("Overflow");
        } else {
            rear++;
            data[rear] = value;
            // data[++rear] = value;
        }
    }

    public void dequeue(){
        if (this.isEmpty()) {
            System.out.println("underflow");
        } else {
            int value = data[front];
            front++;
            // int val = data[front++];
            System.out.println(value);
        }
    }

    public void peek(){
        if (this.isEmpty()) {
            System.out.println("underflow");
        } else {
            System.out.println(data[front]);
        }
    }

    public void printAll(){
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println("");
    }
    
}
