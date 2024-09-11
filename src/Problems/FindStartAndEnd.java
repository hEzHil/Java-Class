package Problems;

import java.util.Arrays;

public class  FindStartAndEnd {
    public static void main(String[] args) {
        int[] nums = {
                1,2,3,4,5,6,6,6
        };
        int[] ans = searchRange(nums,6);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target , true);
        int end = search(nums, target , false);

        ans[0] = start;
        ans[1] = end;
        return ans;

    }

   static int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;

        int start = 0;
        int end = arr.length -1;

        while(start <= end ){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1 ;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }

        }
        return ans;
    }
}
