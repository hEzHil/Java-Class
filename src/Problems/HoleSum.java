package Problems;

import java.util.Scanner;

public class HoleSum {
    //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    public  void sumOfAll(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter numbers (enter 'x' to stop):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("x")) {
                break;
            }
            int number = Integer.parseInt(input);
            sum += number;
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
