package Problems;

public class Palindrome {
    void palindrome(int a ){

        int temp = a;
        int res=0;
        while(a !=0){
            int rem  = a % 10;
            res =( res * 10 )+rem;
            a = a / 10;
        }
        if ( temp == res ){
            System.out.println("Problems.Palindrome");
        }else {
            System.out.println("Not Problems.Palindrome");
        }
    }
}
