package Problems;

import java.util.Scanner;

public class CountOcc {
    public void counting(){
        System.out.println("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count =0;
        int rem;
        while(num >0){
            rem = num % 10;
            if(rem ==3){
                count++;
            }
            num = num /10;
        }
        System.out.println(count);
    }
}
