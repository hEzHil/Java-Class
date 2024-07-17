import java.util.Scanner;

public class SwitchStatement {
    public void switchCase(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Fruit name: ");
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Orange" -> System.out.println("Queen of Fruits");
            case "Jack" -> System.out.println("Nice fruit");
            case "grapes" -> System.out.println("Small fruits");
            default -> System.out.println("Enter a valid fruit name.");
        }

        System.out.println("Enter a day Number: ");
        int day = in.nextInt();
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
