package Oops.Queue;

public class CustomQueue {
    private int[] data ;
    private static final int DEFAULT_SIZE = 10;
    int end =0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    private boolean isFull() {
        return end == data.length; // prt at last index
    }

    private boolean isEmpty() {
        return end == 0; // prt at last index
    }

    public boolean insert(int val){
        if(isFull()){
            return false;
        }
        data[end++] = val;
       return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int removed = data[0];

        // shifts the item to the left
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
       return data[0];
    }

    public void display(){
        for (int i = 0; i < end ; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("End");
    }
}
