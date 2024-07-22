package Problems;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr ={
                {1, 2, 3 },
                {4, 5, 6 },
                {7, 8, 9 },
        };
        System.out.print(Arrays.toString(search(arr, 3)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int col = matrix[0].length;
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, col - 1, target);
        }
        int rStart = 0;
         int rEnd = rows - 1;
        int cMid = col / 2;

        while (rStart < rEnd - 1) { // Ensures we don't get stuck
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have two rows
        // Check whether the target is in the column of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in first half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // Search in second half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, col - 1, target);
        }
        // Search in third half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            // Search in fourth half
            return binarySearch(matrix, rStart + 1, cMid + 1, col - 1, target);
        }
    }
}
