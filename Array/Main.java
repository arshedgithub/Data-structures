public class Main {
    public static void main(String[] args) {

        // declare an array
        int[] arryName = new int[3];

        // initialize array
        arryName[0] = 3;
        arryName[1] = 6;
        arryName[2] = 9;

        // changing an existing value 
        arryName[1] = 21;

        // print all elements
        for (int i = 0; i < arryName.length; i++) {
            System.out.println(arryName[i]);
        }

        // only 3 elements can insert into array.
        arryName[3] = 12;   // arrayIndexOutOfBoundException

    }
}
