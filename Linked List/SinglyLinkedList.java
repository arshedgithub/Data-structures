public class SinglyLinkedList {
    
    SinglyNode head;
    SinglyNode tail;
    int count;

    // when LL is created there are no node in there
    // so head and tail are 0 and count is 0

    public SinglyLinkedList(){
        head = null;
        tail = null;
        count = 0;
    }

    public boolean isEmpty(){
        // if (head == null) {
        //     return true;
        // } else {
        //     return false
        // }
        return head == null;
    }

    // isFull() 

    public void printAll(){
        if (isEmpty()) {
            System.out.println("UnderFlow - Linked List is empty");
        } else {
            SinglyNode current = head;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }
    }

    public SinglyNode search(int value){
        if (isEmpty()) {
            System.out.println("UnderFlow - Linked List is empty");
            return null;
        } else {
            SinglyNode current = head;
            while (current != null) {
                if (current.value == value) {
                    return current;
                }
                current = current.next;
            }

            // if current == null
            System.out.println("Element doesn't exist on the list");
            return null;
        }
    }

    public void addToHead(int x){
        if (isEmpty()) {
            SinglyNode newNode = new SinglyNode(x);
            head = tail = newNode;
            count++;
        } else {
            SinglyNode newNode = new SinglyNode(x);
            newNode.next = head;
            head = newNode;
            count++; 
        }
    }

    public void addToTail(int x){
        if (isEmpty()) {
            SinglyNode newNode = new SinglyNode(x);
            head = tail = newNode;
            count++;
        } else {
            SinglyNode newNode = new SinglyNode(x);
            tail.next = newNode;
            // newNode.prev = tail -> fo doubly
            tail = newNode;
            count++; 
        }
    }

    public void addAfter(int location, int value){
        if (isEmpty()) {
            System.out.println("UnderFlow - Linked List is empty");
        } else {
            // search
            SinglyNode temp = search(location);

            // new node
            SinglyNode newNode = new SinglyNode(value);

            newNode.next = temp.next;
            // newNode.prev = temp; => doubly

            // temp.next.prev = newNode => doubly
            temp.next = newNode;
            count++;
        }
    }

    public void delete(int val){
        if(isEmpty()){
            System.out.println("List is empty");
        } else {
            // SinglyNode pre
        }
    }

    
}
