package packages.task;
public class SwapElement {
    public static void main(String[] args) {
        long A[] = {4, 1, 2, 1, 1, 2};
        long B[] = {3,6,3,3};
        int n = A.length;
        int m = B.length;

        long aTotal=0;
        long bTotal=0;
        for(int i=0;i<n;i++){
            aTotal = aTotal + A[i];
        }
        for(int i=0;i<m;i++){
            bTotal = bTotal + B[i];
        }
       for(int i=0;i<n;i++){
           for(int k =0;k<m;k++){
               if (aTotal < bTotal || aTotal > bTotal) {
                   long temp = A[i];
                   A[i] = B[k];
                   B[k] = temp;
                   long a = 0;
                   long b = 0;
                   for (int j = 0; j < n; j++) {
                       a = a + A[j];
                   }
                   for (int j = 0; j < m; j++) {
                       b = b + B[j];
                   }
                   if( a == b){
                       System.out.println();
                       break;
                   }

               }
           }
       }

    }
}
