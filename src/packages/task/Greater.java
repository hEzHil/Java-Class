package packages.task;

import java.util.ArrayList;

public class Greater {
    public static void main(String[] args) {
        int[] arr ={16,17,4,3,5,2};
        int[] arr1 =new int[arr.length];
        ArrayList<Integer> Al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr[i]<=arr1[j] && arr[i]!= arr1[j]){
                    System.out.println(arr[j]);
//                    System.out.println(arr.);
                }
            }

        }
    }
}
