public class Queue {
    
    SinglyLinkedList data;

    public Queue(){
        data = new SinglyLinkedList();
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public void enqueue(int value){
        data.addToTail(value);
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("UnderFlow Error - Queue is empty");
        } else {
            int value = data.head.value;
            data.deleteFromHead();
            System.out.println(value);
        }
    }

    public void peek(){
        if (isEmpty()) {
            System.out.println("UnderFlow Error - Queue is empty");
        } else {
            int value = data.head.value;
            System.out.println(value);
        }
    }

    public void printAll(){
        data.printAll();
    }
}
