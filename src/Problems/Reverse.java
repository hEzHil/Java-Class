package Problems;

import java.util.Scanner;

public class Reverse {
    public void reversing(){
        System.out.println("Enter a number :");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = 0;
        while( num > 0 ){
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem ;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "hello ezhil";
        String ans = "";
        for(int i =0; i < str.length(); i++){
            ans = str.charAt(i) + ans;
        }
        System.out.println(ans);
    }
}
