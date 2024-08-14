package Oops.Stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(40);
        stack.push(44);
        stack.push(22);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // it will throw the exception because u have removed the element from the stack
        // and it is empty so it will throw the exception
//        System.out.println(stack.pop());

//        System.out.println(stack.peek());

        // ----------------------------------------//
        //          Dynamic Stack                 //

        DynamicStack stack1=  new DynamicStack();
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(9);
        stack1.push(0);
        stack1.push(5);
        stack1.push(1);

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());



    }
}
