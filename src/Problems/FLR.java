package Problems;

//FrequenciesofLimitedRange
public class FLR {
	public static void main(String[] args){
 	   int[] arr = {2, 3, 2, 3, 5};
	   int n = arr.length;
	   int P =5;
		int[] freq = new int[n];

		// Step 2: Count frequencies
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0 && arr[i] <= n) {
				freq[arr[i] - 1]++;
			}
		}

		// Step 3: Update original array with frequency counts
		for (int i = 0; i < n; i++) {
			arr[i] = freq[i];
			System.out.println(arr[i]);
		}
		
	}

	static int count(int[] arr, int num , int n){
	
	int max = 0;
	for(int i=0;i<n;i++){
		if(arr[i] == num){
		  max++;
		}
	}
	return max;	
}
}
