package Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
            long[] arr = {1,2,3,4,5,6};
            int n = arr.length;
            rearrange(arr,n);
    }
    static void rearrange(long arr[], int n){
        // Your code here

        if (n == 0) return;

        // Find maximum element in the array
         long maxElement = arr[n - 1] + 1;

        int minIndex = 0;
        int maxIndex = n - 1;

        // Rearrange the array using the encoding technique
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even index -> max value
                arr[i] += (arr[maxIndex] % maxElement) * maxElement;
                maxIndex--;
            } else {
                // Odd index -> min value
                arr[i] += (arr[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }

        // Decode the values
        for (int i = 0; i < n; i++) {
            arr[i] /= maxElement;
        }
        System.out.println(Arrays.toString(arr));


    }
}
