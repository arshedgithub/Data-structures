public class Stack {

    int tos;        // Index of top of the stack
    int data[];     // stack array
    
    public Stack(int size){
        data = new int[size];
        tos = -1;
    }

    public Stack(){
        this(5);
    }
    
    public boolean isEmpty(){
        // if (tos == -1) {
        //     return true;
        // } else {
        //     return false;
        // }
        return tos == -1;
    }

    public boolean isFull(){
        // if (tos == data.length - 1) {
        //     return true;
        // } else {
        //     return false;
        // }
        return tos == data.length - 1;
    }

    

}
