package Problems;

import java.util.Arrays;

public class TwoDBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1},

        };
        int target = 3;
        System.out.println(searchMatrix(arr,target));

    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length -1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c]== target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search1(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length ;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c]== target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }

    public static boolean searchMatrix(int[][] matrix, int target) {


        int c = matrix.length ;
        if(c == 1){
            return search3(matrix,target);
        }
        else{
            return search4(matrix,target);
        }


    }
    static boolean search3(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length;
        while(r < matrix.length && c >=0){
            if(matrix[r][c] == target){
                return true;
            }
            if(matrix[r][c] < target ){
                r++;
            }
            else{
                c--;
            }

        }
        return false;
    }
    static boolean search4(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length -1;
        while(r < matrix.length && c >=0){
            if(matrix[r][c] == target){
                return true;
            }
            if(matrix[r][c] < target ){
                r++;
            }
            else{
                c--;
            }

        }
        return false;
    }
}
