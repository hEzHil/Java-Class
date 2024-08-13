package Oops.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuildFunctions {
    public static void main(String[] args){
        // Queue is Interface
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(30);
        queue.add(40);
        queue.add(12);
        queue.add(5);

        // In queue peek() method will show the first added item
        // for example we added first 10 in the list and below method it should print the 10
        System.out.println(queue.peek());

        // this remove method will remove the first element which is added
        // So it will print 10
        // Try it.
        System.out.println(queue.remove());

        // if a remove it again then 30 will be removed and so on
        System.out.println(queue.remove());

    }
}
