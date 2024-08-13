package Oops.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(3);
        // it Follows the first in first out principle

        // add the value to queue one by one
        queue.insert(10);
        queue.insert(45);
        queue.insert(56);
        queue.insert(35);
        // display the queue
        queue.display();

        // remove the first element in the queue
        queue.remove();
        queue.display();
        // print the front value in the queue
        System.out.println(queue.front());

    }
}
