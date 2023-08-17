package packages.calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        double  n1 =in.nextDouble();
        System.out.println("Enter number 2");
        double n2 =in.nextDouble();
        double result;
        System.out.println("Enter a operator");
        char op = in.next().charAt(0);
        switch (op){
            case '+':
                result = n1 + n2;
                System.out.print("Total is "+ " "+ result);
                break;
            case '-':
                result = n1 - n2;
                System.out.print("Total is "+" "+result);
                break;
            case '*':
                result = n1* n2;
                System.out.print("Total is "+" "+ result);
                break;
            case'/':
                result = n1 / n2;
                System.out.println("Total is"+" "+result);
                break;
            case'%':
                result = n1 % n2;
                System.out.print("Total is "+" "+result);
                break;
            default:
                System.out.print("Wrong Op is given");
        }
    }
        }
