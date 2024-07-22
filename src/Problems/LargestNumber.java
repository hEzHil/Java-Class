package Problems;

import java.util.Scanner;

public class LargestNumber {

    public  void  largestNumber(){
        System.out.println("Enter First Number:");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = in.nextInt();
        System.out.println("Enter Third Number");
        int num3 = in.nextInt();
        int max = num1;

        if(num2> max){
            max = num2;
        }
         if(num3 > max ){
            max = num3;
        }
        System.out.println("Largest Number is : " + max);

    }
}
