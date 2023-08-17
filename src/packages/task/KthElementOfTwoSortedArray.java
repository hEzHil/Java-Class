package packages.task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class KthElementOfTwoSortedArray {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int k = in.nextInt();
        long arr1[] = {2, 3, 6, 7, 9};
        long arr2[] = {1, 4, 8, 10};
        long ar = arr1.length;
        long ar1 = arr2.length;
        long n = ar + ar1;


       ArrayList<Long> al = new ArrayList<>();
       for(int i=0;i<arr1.length;i++){
           al.add(arr1[i]);

       }
       for(int i=0;i<arr2.length;i++){
           al.add(arr2[i]);
       }

       Collections.sort(al);
       int i=0;
      while(i<al.size()) {
          if(i==k){
              System.out.print(al.get(i-1));
          }
          i++;
      }
    }
}
