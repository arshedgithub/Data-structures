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


}
