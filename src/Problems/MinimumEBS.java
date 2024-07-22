package Problems;

public class MinimumEBS {
    public static void main(String[] args) {
        int[] arr ={ 2,2,2,0,1};
        int ans = search(arr);
        System.out.println(ans);
    }
    static int search(int[] nums  ){
        int pivot = findPivot(nums);

        // if you not find the pivot then it means the array is not rotated
        if(pivot == -1){
            return binarySearch(nums, 0, nums.length -1);
        }
        // if ypu found the pivot then you find two ascending sorted arrays

        return binarySearch(nums,pivot+1, nums.length -1);


    }

    static int binarySearch(int[] arr, int start, int end ){

        //Run the loop while start is less than or equal to end
        while(start <= end){
            //Find the mid value of the array using this formula
            // 0 + ( 10 - 0) / 2 = 5 so the mid value is five
            int mid = start + (end - start) / 2;

            // if the target element is less than arr of mid element then change the value of end = mid -1
            if(arr[mid] < arr[mid +1]){
                end = mid -1;
            }

            // or else target greater than arr of mid element then change the value of start to mid +1
            else if( arr[mid] > arr[mid-1]){
                start = mid + 1;
            }
            // else the return mid value because u will figure it out the mid value
            // so the mid value will be the last answer
            else{
                return mid;
            }

        }
        // nothing found means then return -1;
        return start;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end ){
            int mid = start + (end - start ) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if( mid > start && arr[ mid ] < arr[mid -1 ]){
                return mid -1;
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            }
            else{
                start = mid +1 ;
            }

        }
        return -1;
    }
}
