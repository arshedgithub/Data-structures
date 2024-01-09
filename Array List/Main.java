public class Main {
    
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();

        list.add(10);         
        list.add(20);        
        list.add(30);
        
        System.out.println(list.isFull());

        list.add(40);
        list.add(50);

        list.printAll();

    }

}
