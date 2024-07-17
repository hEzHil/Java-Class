public class Amazon {
    public static void main(String[] args) {

    }
    // Find Position of element in infinity Sorted array
     static int ans(int[] arr, int target ){
        int start =0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = start +( end - start + 1) * 2;
            start = temp;
        }
        return binsearch(arr, target , start , end);
     }

     static int binsearch(int[] arr, int target, int start, int end){
        while(start <= end ){
            int mid = start + (end - start ) /2 ;
            if(target < arr[mid]){
                end = mid +1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
     }


}
