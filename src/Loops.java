import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Loops {
    public static void main(String[] args) {
       forEach();
    }

    static  void forEach(){
        String[] name = new String[3];
        // input using loop
        Scanner in = new Scanner(System.in);

        for(int  i=0; i< name.length;i++){
            name[i] =in.nextLine();
        }
        System.out.println(Arrays.toString(name));

//        for ( String names : name){
//            System.out.println(names);
//        }
    }

}
