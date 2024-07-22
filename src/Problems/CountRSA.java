package Problems;

// Q : Find the rotated count in rotated sorted array
public class CountRSA {
    public static void main(String[] args) {
            int[] arr = {1,2,4,5,6};
            System.out.println(countRotation(arr) );
    }
    static int countRotation(int[] arr){
      int count =   findPivot(arr);
        return count +1;
    }
    //Not contains any duplicate value then use it .
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end ){
            int mid = start + ( end - start) /2;
            if(mid < end  && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid -1 ]){
                return mid -1;
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
    // use this method when the duplicate values are in the array
    static int pivotDuplicate(int[] nums){
        int start =0;
        int end = nums.length -1;

        while(start <= end ){
            int mid = start + (end - start ) / 2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if( mid > start && nums[mid] < nums[mid -1]){
                return mid -1;
            }
            // if the middle, start , end element are equal then skip the duplicate
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                // skip duplicates
                //Note: what if the element the start and end may the pivot
                // check whether the start is pivot
                if(nums[start] > nums[start +1]){
                    return start;
                }
                //otherwise the skip the duplicate from start
                start++;
                // check the end value whether is pivot
                if(nums[end] < nums[end-1]){
                    return end -1;
                }
                //otherwise skip the end duplicate
                end--;
            }
        }
        return -1;
    }
}
