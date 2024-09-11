package String;

import java.util.Arrays;

//
public class Problem {
        public static void main(String[] args){

            String name = "hello";
            String reverse = "";
            int len = name.length();
            for (int i = 0; i <len; i++){
                reverse = name.charAt(i) + reverse;
            }
            System.out.println(reverse);
            String str = new String("");
            str = "ezhil";
            String str1 = new String("");
            str1 = "mahil";
            System.out.println(str==str1);



        }
     // to find out whether the string is just one mismatch
     static String isStringExist(String arr[],String S){

            // write in the main function
            // String arr[] = {"bana","apple","banaba","bonanzo"};
            // String S = "banana"
        // code here

        for(String s : arr){

            if( s.length() == S.length() &&isOneCharDifference(s,S) ){
                return "True";
            }
        }
        return "False";
    }

    // return true when count == 1 or else false
    // used for isStringExist() method
    static boolean isOneCharDifference(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return count == 1;
    }
}