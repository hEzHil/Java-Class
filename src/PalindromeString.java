import java.util.Scanner;

public class PalindromeString {
    void palindromeString(){
        //To find out whether the given String is Palindrome or not
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String or word : ");
        String input = in.nextLine();
        String rev = "";

        for(int i = input.length()-1;i>=0;i--){
            rev = rev + input.charAt(i);
        }

        if(input.equals(rev)){
            System.out.println("Given word   " + rev +" is  palindrome");
        }
        else{
            System.out.println("Not a Palindrome word "+ input);
        }
    }
}
