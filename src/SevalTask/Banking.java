package SevalTask;
import java.util.Scanner;

public class Banking {
 public   static long balance = 10000;
    public static long  withDraw(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Amount to Withdraw");
        long x = in.nextLong();
        long c=balance;
        if(x <= balance){
            System.out.println("withdraw  is success ");
             c = c - x;
             System.out.println(c +" is your Account balance");

        }
        return c;
    }
    public static long Deposite(){
        Scanner in = new Scanner(System.in);
        long c=balance;
        System.out.println("Enter the Amount to deposite");
        long x =in.nextLong();
        c = c + x;
        System.out.println("Successfully Deposited");;
        return c;

    }

    public static void main(String[] args) {
        System.out.println("Your balance is  "+balance);
        System.out.println("Your bank Balance is  "+Deposite());
       withDraw();




    }

}
