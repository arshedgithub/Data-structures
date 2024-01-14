public class SinglyNode {
    int value;
    SinglyNode next;

    SinglyNode(int x){
        // value = x;
        // next = null;
        this(x, null);
    }

    SinglyNode(int x, SinglyNode n){
        value = x;
        next = n;
    }

}