package Problems;

import java.util.Scanner;

public class Calculator {
    public void cal(){

        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Enter an Operator: ");
            char ch = in.next().trim().charAt(0);
            int result =0;
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch =='%'){
                System.out.println("Enter Two Numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(ch == '+'){
                    result = num1 + num2 ;
                }
                if(ch == '-'){
                    result = num1 - num2;
                }
                if(ch == '*'){
                    result = num1 * num2;
                }
                if(ch == '/'){
                    if(num2 != 0){
                        result = num1 / num2;
                    }
                }
                if(ch == '%'){
                    result = num1 % num2;
                }

            }else if(ch == 'x' || ch =='X'){
                break;
            }
            else{
                System.out.println("Invalid Operator");
            }
            System.out.println(result);
        }

    }
}
