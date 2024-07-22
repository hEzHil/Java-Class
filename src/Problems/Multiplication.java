package Problems;

import java.util.Scanner;

public class Multiplication {
    //Take a number as input and print the multiplication table for it.

    public void multiplication(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int multi = in.nextInt();
        System.out.println("multiplication Table of " + multi);
         for (int i =1; i<=10; i++){
             int temp = multi * i ;
             System.out.println(temp);
         }

    }
}
