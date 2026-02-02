// Binary Search in a Row Column Matrix (2D array: Sorted) using order Binary search
import java.util.Arrays;
public class BinarySearchInRowColSorted {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int toFind = 37;
        System.out.println(Arrays.toString(binarySearch(arr, toFind)));
    }

    static int[] binarySearch(int matrix[][], int target){
        int r = 0;
        int c = matrix[0].length -1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) return new int[] {r, c};
            if (matrix[r][c] < target) r++;
            else c--;
        }
        return new int[]{-1,-1};
    }
}