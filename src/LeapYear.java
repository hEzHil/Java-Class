import java.util.Scanner;

public class LeapYear {
    //Input a year and find whether it is a leap year or not.
    public void leap(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year :");
        int year = in.nextInt();

        if( year % 4 == 0){
            System.out.println( year + " year is leap year");
        }
        else {
            System.out.println( year + " Not e Leap year");
        }
    }
}
