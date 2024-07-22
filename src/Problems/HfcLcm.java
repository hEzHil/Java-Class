package Problems;

import java.util.Scanner;

public class HfcLcm {
    public void result(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int t1 = num1;
        int t2 = num2;

        while( t2 != 0){
            int temp = t2;
            t2 = t1 % t2;
            t1 = temp;
        }
        int hfc = t1;
        int lcm = (num1 * num2 ) / hfc;
        System.out.println("Lcm is "+ lcm);
        System.out.println("Hfc is "+ hfc);
    }
}
