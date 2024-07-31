package Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternativeSorting {
    public static void main(String[] args){
        long arr[] = {7, 1, 2, 3, 4, 5, 6};
        Arrays.sort(arr);
        int i =0;
        int start = 0;
        int end = arr.length -1;
        ArrayList<Long> ans = new ArrayList<>();
        while(start <= end){
           ans.add(arr[end]);
           ans.add(arr[start]);
           start++;
           end--;
        }
        ans.remove(arr.length -1);
        System.out.println(ans);

    }
}
