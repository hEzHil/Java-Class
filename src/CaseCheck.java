import java.util.Scanner;

public class CaseCheck {
    public void checker(){
        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);
        if(ch >= 'a' && ch<='z'){
            System.out.println("Lower Case");
        }
        else {
            System.out.println("Upper Case");
        }
    }
}
