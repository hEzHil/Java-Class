package Oops.Stack;

import java.util.Stack;

public class InBuildFunction {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        // Stack follows Last In First Out principle
        // Push() is used to add the items in stack in one by one
        stack.push(20);
        stack.push(2);
        stack.push(4);
        stack.push(23);
        stack.push(90);

        // Pop() is removing the element from the stack and return it so we are printing it
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // peek() is to print last the item stored in stack
        // for example
        System.out.println(stack.peek());

    }
}
