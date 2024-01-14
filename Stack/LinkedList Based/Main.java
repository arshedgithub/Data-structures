public class Main {
    
    public static void main(String[] args) {

        // SinglyNode newNode = new SinglyNode(8);

        SinglyLinkedList LL = new SinglyLinkedList();
        LL.addToHead(90);        
        LL.addToHead(50);
        
        LL.addToTail(30);
        LL.addToTail(20);

        LL.addAfter(30, 45);
        LL.delete(30);
        LL.printAll();
        LL.deleteFromHead();
        LL.printAll();

        // System.out.println(x);



    }

}
