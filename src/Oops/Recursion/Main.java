package Oops.Recursion;

public class Main {
    // Recursion is programming technique where a method calls itself to solve a problem
    public static void main(String[] args) {
//        sayHi(3);
        System.out.println(factorial(10));
    }
    public static void sayHi(int count ){
        System.out.println("Hi");
        if(count <= 1){
            return;
        }
        sayHi(count -1);
    }

    public static int factorial(int n){
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n -1);
    }
}
