import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
//        int[] arr = { 5,4,2,3,1};
//        selection(arr);
//        System.out.print(Arrays.toString(arr));
        for(String arg : args){
            System.out.println(arg);
        }
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int end = arr.length -i -1;
            int maxVal = maxValue(arr, 0, end);
            swap(arr, maxVal,end);
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

     static int maxValue(int[] arr, int start, int end) {
            int max = start;
            for(int i=start;i<=end;i++){
                if(arr[max] < arr[i]){
                    max = i;
                }
            }
            return max;
    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
           swapped = false;
            for (int j = 1; j < arr.length -i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }
        }
    }
}
