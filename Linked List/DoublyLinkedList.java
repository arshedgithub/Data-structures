public class DoublyLinkedList {

    DoublyNode head;
    DoublyNode tail;
    int count;

    // when LL is created there are no node in there
    // so head and tail are 0 and count is 0

    public DoublyLinkedList(){
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

    public void printAll(){
        if (isEmpty()) {
            System.out.println("UnderFlow - Linked List is empty");
        } else {
            DoublyNode current = head;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }
    }

    public DoublyNode search(int value){
        if (isEmpty()) {
            System.out.println("UnderFlow - Linked List is empty");
            return null;
        } else {
            DoublyNode current = head;
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
            DoublyNode newNode = new DoublyNode(x);
            
            head = tail = newNode;
            count++;

        } else {
            DoublyNode newNode = new DoublyNode(x);
            
            newNode.next = head;
            head.prev = newNode;

            head = newNode;
            count++; 

        }
    }

    public void addToTail(int x){
        if (isEmpty()) {
            DoublyNode newNode = new DoublyNode(x);

            head = tail = newNode;
            count++;

        } else {
            DoublyNode newNode = new DoublyNode(x);
            
            tail.next = newNode;
            newNode.prev = tail;

            tail = newNode;
            count++; 
            
        }
    }

    public void addAfter(int location, int value){
        if (isEmpty()) {
            System.out.println("UnderFlow - Linked List is empty");
        } else {
            // search
            DoublyNode temp = search(location);

            // new node
            DoublyNode newNode = new DoublyNode(value);

            newNode.next = temp.next;
            newNode.prev = temp;

            temp.next.prev = newNode;
            temp.next = newNode;

            count++;
        }
    }

    public void delete(int val){
        if(isEmpty()){
            System.out.println("List is empty");
        } else {
            // DoublyNode pre
        }
    }

    
}
