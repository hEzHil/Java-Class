import java.util.Scanner;

public class SimpleInterest {
    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    void simple(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principle: ");
        double p = in.nextDouble();
        System.out.println("Enter a Time : ");
        double t = in.nextDouble();
        System.out.println("Enter a rate : ");
        double r = in.nextDouble();

        double interest = (p * r * t) / 100;
        System.out.println("Simple Interest is " + interest);
    }
}
