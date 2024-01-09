public class DoublyNode {
    
    int value;
    DoublyNode prev;
    DoublyNode next;

    DoublyNode(int x){
        // value = x;
        // prev = null; 
        // next = null;
        this(x, null, null);
    }
    
    DoublyNode(int x, DoublyNode p, DoublyNode n){
        value = x;
        prev = p;       
        next = n;
    }
    
}
