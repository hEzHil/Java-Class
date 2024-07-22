package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {

    void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+ " "+b);
    }
    void reverse(int[] arr){
            //  this code should be in the main  function or method
            //  Scanner in = new Scanner(System.in);
            //  Problems.Swap swap = new Problems.Swap();
            //  int[] arr = {1,2,3,4,5,6,7,8,9};
            //  swap.reverse(arr);
            //  System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = arr.length -1;
        while(start < end){
            swap2(arr , start, end);
            start++;
            end--;
        }
    }

    void swap2(int[] arr ,int index1, int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    

}
