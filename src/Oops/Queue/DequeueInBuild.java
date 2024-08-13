package Oops.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueInBuild {
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(40);
        deque.add(40);

        // remove element will remove the first element from the deque
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        // remove last will remove the last element or an item which is in the deque
        System.out.println(deque.removeLast());

        // and remove method will throw an exception when the deque is empty
        System.out.println(deque.remove());
        // and dequeue has more methods
        // it can add first Element and last element
        // so click the Deque class and check it what are the methods it has

        // poll() method is used to remove the element from the deque
        // it deffer from remove method because it will not give the exception when the deque is empty
        deque.poll();
    }
}
