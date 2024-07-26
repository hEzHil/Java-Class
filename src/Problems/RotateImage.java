package Problems;

public class RotateImage{
  public static void main (String[] args){
     int[][] matrix = {{1,2,3},
                       {4,5,6},
        	       {7,8,9}};
     int length = matrix.length;
     for(int i=0;i<length;i++){
	for(int j=i;j<length;j++){
		int temp = matrix[i][j];
		matrix[i][j] = matrix[j][i];
		matrix[j][i] = temp;
	}
	}
	// reverse each array
	for (int i = 0; i <length ; i++) {
            int left = 0, right = length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

	for(int i=0;i<matrix.length;i++){
	  for(int j=0;j<matrix[0].length;j++){
		System.out.print(matrix[i][j] + " ");
	  }
       }
}
}
