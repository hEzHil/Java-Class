public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr,int target){
        //findPeakElement function called and stored in peak integer
         int peak = findPeakElement(arr);
         //orderAgnosticBS function is called to check in ascending order till the peak
         int firstTry = orderAgnosticBS(arr,target, 0,peak);
         if(firstTry != -1){
             //if the firsttry is not equal to -1 then return the value
             return firstTry;
         }
         //or else return the descending order function  runs on orderAgnosticBS
         return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    //find the peak element int the array
   static  int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length -1;

        while(start < end){
            int mid = start + (end - start ) / 2;
            if(nums[mid] > nums[mid+1]){
                end = mid ;
            }
            else{
                start = mid +1;
            }
        }
        return start;
    }
    //search in ascending or descending order based on the condition
    static int orderAgnosticBS(int[] arr , int target,int start, int end ){


        boolean asc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) /2 ;
            if(arr[mid]==target){
                return mid;
            }
            if(asc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
