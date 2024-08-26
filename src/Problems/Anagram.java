package Problems;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "ezhil";
        String n = "lihz";
        if(anagram(s, n)){
            System.out.println("It is Anagram");
        }
        else {
            System.out.println("It is not an Anagram");
        }
    }
    static boolean anagram(String s , String n){
        char[] charArr = s.toCharArray();
        char[] charArr2 = n.toCharArray();
        Arrays.sort(charArr);
        Arrays.sort(charArr2);
        return charArr.equals(charArr2);
    }
}
