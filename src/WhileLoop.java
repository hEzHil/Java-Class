import java.util.Scanner;

public class WhileLoop {

    void whileLoop(){
        System.out.println("Enter a number for whileLoop:");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int num = 1;
        while(num != target){
            System.out.print(num + " ");
            num++;
        }
    }
}
