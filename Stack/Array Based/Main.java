public class Main {
    
    public static void main(String[] args) {
        
        Stack stack = new Stack(10);

        System.out.println(stack.isEmpty()); 
        System.out.println(stack.isFull());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peak());
        System.out.println(stack.pop());

    }
    
}