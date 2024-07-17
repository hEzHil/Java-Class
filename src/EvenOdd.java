import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // [2,3,4,5,6,7,8,9]
        int[] nums ={2,3,4,5,6,7,8,9};
        int len = nums.length;
//        evenOdd(nums,len);
        evenOdd2(nums,len);
    }
    static int[] evenOdd2(int[] nums, int len){
        int j=0;
        int k=1;
        int[] ans = new int[len];
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 ==0){
                ans[j] = nums[i];
                j +=2;
            }
            else{
                ans[k] = nums[i];
                k +=2;
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }


    // to find the even number to odd in ascending to descending
    static int[] evenOdd(int[] nums, int len){
        int n = len / 2;
        int[] ans1 = new int[len];
        int[] ans2 = new int[n];
        int j=0;
        int k=0;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans1[j] = num;
                j++;
            } else {
                ans2[k] = num;
                k++;
            }
        }
        swap(ans2);
        for(int i=0;i<ans2.length;i++){
            ans1[n+i] = ans2[i];
        }
        for (int value : ans1) {
            System.out.print(value + " ");
        }

        return ans1;
    }

    //swap method to swap the second array
    static int[] swap(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
