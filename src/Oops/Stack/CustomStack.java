package Oops.Stack;

public class CustomStack {
   protected int[] data;
   private static final int DEFAULT_SIZE = 10;

   int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from the Empty Stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return  data[ptr];

    }

    public boolean push(int val){

        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length -1; // prt at last index
    }

    public boolean isEmpty() {
        return ptr == -1; // prt at last index
    }

}
