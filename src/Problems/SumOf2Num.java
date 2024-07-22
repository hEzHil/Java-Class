package Problems;

import java.util.Scanner;

public class SumOf2Num {
    //Take two numbers and print the sum of both.
    public void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number one:");
        int num1 = in.nextInt();
        System.out.println("Enter Number Two:");
        int num2 = in.nextInt();
        int result =num1 + num2;
        System.out.println( "Answer = " + result );
    }
}

