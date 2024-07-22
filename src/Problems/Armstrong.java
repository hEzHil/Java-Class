package Problems;

import java.util.Scanner;

public class Armstrong {
    //To find Class.Armstrong Number between two given number.
    void armstrong(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = in.nextInt();
        int temp = input;
        int rem = 0 ;
        int result =0;
        while(temp != 0 ){
            rem = temp % 10;
            result += rem * rem * rem;
            temp = temp / 10;
        }
        if(result == input) {
            System.out.println("It is Class.Armstrong");
        }
        else {
            System.out.println("It is not a Class.Armstrong");
        }
    }
}
