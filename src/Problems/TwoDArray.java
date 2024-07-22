package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    void twoD(){
        Scanner in = new Scanner(System.in);
        int[][] arr  = new int[3][3];
        System.out.println("Enter number for two D Array");
        for(int row =0;row<arr.length;row++){
            for(int col =0;col<arr[row].length;col++){

                arr[row][col] = in.nextInt();
            }
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints) + "  ");
        }
    }

     int[] search2dArray(int[][] arr, int target){

        for(int row =0; row < arr.length; row ++){
            for( int col =0; col < arr[row].length; col++){
                if(target == arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    int maxValue(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
