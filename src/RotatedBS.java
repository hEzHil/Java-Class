public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,4};
        int target = 0;
       int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] nums ,int target ){
        int findPivot = pivot(nums);
        // if you not find the pivot then it means the array is not rotated
        if(findPivot == -1){
           return binarySearch(nums, target, 0, nums.length -1);
        }
        // if ypu found the pivot then you find two ascending sorted arrays
        if(target == nums[findPivot]){
            return findPivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, findPivot-1);

        }

            return binarySearch(nums,target,findPivot+1, nums.length -1);


    }
   static int binarySearch(int[] arr, int target ,int start, int end ){

        //Run the loop while start is less than or equal to end
        while(start <= end){
            //Find the mid value of the array using this formula
            // 0 + ( 10 - 0) / 2 = 5 so the mid value is five
            int mid = start + (end - start) / 2;

            // if the target element is less than arr of mid element then change the value of end = mid -1
            if(target < arr[mid]){
                end = mid -1;
            }

            // or else target greater than arr of mid element then change the value of start to mid +1
            else if( target > arr[mid]){
                start = mid + 1;
            }
            // else the return mid value because u will figure it out the mid value
            // so the mid value will be the last answer
            else{
                return mid;
            }
        }
        // nothing found means then return -1;
        return -1;
    }
    // this will not work for duplicate values
    static int pivot(int[] nums){
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
            if(nums[mid] <= nums[start]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
    // pivot method to find the  peak number with the duplicate value in the array
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
