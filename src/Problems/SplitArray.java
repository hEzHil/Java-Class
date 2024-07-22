package Problems;

public class SplitArray {
    public static void main(String[] args) {
            int[] nums ={7,2,5,10,8};
            int ans = splitArray(nums, 2);
            System.out.println(ans);

    }

    static int splitArray(int[] nums, int k) {
            int start =0;
            int end =0;
            // find the start and end value
            for(int i=0; i< nums.length;i++){
                start = Math.max(start, nums[i]);
                end += nums[i];
            }

            // binary search
            while(start < end){
                // try for the middle as potential ans
                int mid = start + (end - start ) / 2;

                // calculate how may piece you can divide this in with this sum
                int sum =0;
                int piece = 1;
                for(int num : nums){
                    if(sum + num > mid){
                        sum = num ;
                        piece++;
                    }
                    else{
                        sum +=num;
                    }
                }
                if(piece > k ){
                    start = mid +1;
                }
                else{
                    end = mid;
                }
            }
            return end;
    }
}
