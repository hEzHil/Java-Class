package Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOf2Arrays {
    public static void main(String[] args){
        int A[] = {5, 6, 3};
        int B[] = {8, 4, 2};
        int ans1 = number(A);
        int ans2 = number(B);
       

        int sum = ans1 + ans2;
        ArrayList<Integer> answer = new ArrayList<>();
        String numString = String.valueOf(sum);
        for (int i = 0; i < numString.length(); i++) {
            // Convert each character to an integer and add it to the ArrayList
            int digit = Character.getNumericValue(numString.charAt(i));
            answer.add(digit);
        }
        System.out.println(answer);
    }
    static int number(int[] arr){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            int rem = arr[i] % 10;
            ans = ans * 10 + rem;
        }
        return ans;
    }
}
