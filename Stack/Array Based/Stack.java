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
        if (tos == -1) {
            return true;
        } else {
            return false;
        }
        // return tos == -1;
    }

    public boolean isFull(){
        if (tos == data.length - 1) {
            return true;
        } else {
            return false;
        }
        // return tos == data.length - 1;
    }

    public void push(int value){
        if (isFull()) {
            System.out.println("OverFlow Error - stack is full.");
        } else {
            tos++;
            data[tos] = value;
            // data[++tos] = value;

        }
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("UnderFlow Error - stack is empty");
            return -1;
        } else {
            int value = data[tos];
            tos--;
            return value;
            // return data[tos--];
        }
    }

    public int peak(){
         if (isEmpty()) {
            System.out.println("UnderFlow Error - stack is empty");
            return -1;
        } else {
            return data[tos];
        }
    }

    public void printAll(){
        if (isEmpty()) {
            System.out.println("UnderFlow Error - Stack is empty");
        } else {
            for(int i = tos; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
        }
    }

}
