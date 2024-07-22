package Problems;

public class Freq {
    public static void main(String[] args) {
      int  arr[] = {1, 2, 1, 3, 4, 3};
        twoRepeated(arr);
    }
    static void twoRepeated( int arr[]) {
        // Your code here
        int[] freq = new int[57];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(freq[i] == 2){
                System.out.println(i);
            }
        }

    }
}
