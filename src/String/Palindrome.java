package String;

public class Palindrome {
    public static void main(String[] args){
        String name ="aba";
        System.out.println(palindrome(name));
    }

    static boolean palindrome(String name){
        if( name == null || name.length() == 0){
            return true;
        }
        int start = 0;
        int end = name.length() -1;
        while(start <= end) {
            if (name.charAt(start) != name.charAt(end)) {
               return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
