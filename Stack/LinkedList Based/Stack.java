public class Stack {

    SinglyLinkedList data;

    public Stack(){
        data = new SinglyLinkedList();
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    // No need of isFull() method as this stack was implemented by using Linked List
    // public boolean isFull(){}

    public void push(int value){
        data.addToHead(value);
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("UnderFlow Error - stack is empty");
            return -1;

        } else {
            int value = data.head.value;
            data.deleteFromHead();
            return value;
        }
    }

}
