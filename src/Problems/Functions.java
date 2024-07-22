package Problems;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        //        greeting();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Name : ");
        String name = in.nextLine();
        System.out.println(greeting2(name));
    }
    static String greeting(){
        String greet = "Hello My Friend";
        System.out.println(greet);
        return greet;
    }
    static String greeting2(String name ){

        String greet = "Hello My Friend " + name;
        return greet;
    }

}
