package Problems;

import java.util.Scanner;

public class NestedSwitch {
    public void nested(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Emp Id :");
        int empId = in.nextInt();


        switch (empId) {
            case 1 -> System.out.println("Ajay Milton");
            case 2 -> System.out.println("Yosuva Berry");
            case 3 -> {
                System.out.println("Emp Number 3");
                System.out.println("Enter a Department Name :");
                String dep = in.next();
                switch (dep) {
                    case "IT" -> System.out.println("Information Technology Department");
                    case "CSC" -> System.out.println("Computer Science Department");
                    case "AI & DS" -> System.out.println("Artificial Intelligence And Data Science Department");
                    default -> System.out.println("Enter valid Department");
                }
            }
            default -> System.out.println("Enter Valid EmpId .");
        }
    }
}
