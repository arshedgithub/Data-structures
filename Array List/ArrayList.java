public class ArrayList {

    int data[];
    int count = 0;

    public ArrayList(int x){
        // initializing array with user input length 
        data = new int[x];
    }

    public ArrayList(){
        // initializing array with 3 element length

        // data = new int[3];
        this(3);
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == data.length;
    }

    public void add (int value){

        if (isFull()) {

            //  1. Creating a New temporary array.
            int[] temp = new int[data.length + 1];

            //  2. Copying old array elements into the new temporary array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            //  3. Insert new data into new temporary array
            temp[count] = value;
            count ++;

            //  4. Deleting the old array by replacing new array into old array.
            data = temp;
            
        } else {
            data[count] = value;
            count++;
        }
    }

    public void printAll(){

        for (int i = 0; i < count; i++) {
            System.out.println(data[i]);
        }

    }

    
}
