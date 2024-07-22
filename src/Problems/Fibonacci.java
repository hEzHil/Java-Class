package Problems;

import java.util.Scanner;

public class Fibonacci {
    //To calculate Problems.Fibonacci Series up to n numbers.
    public void fibonacci(){
        int a = 0, b =1;
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int i =2;
        while(i <= n){
           int num = a + b;
            a = b;
            b = num;
            i++;
        }
        System.out.println(b);


    }
}
