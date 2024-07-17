import java.util.Scanner;

public class ForLoop {
    void forLoop(){
        System.out.println("Enter a num for forLoop:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=0; i<num; i++){
            System.out.println(i+ " ");
        }
    }
}
