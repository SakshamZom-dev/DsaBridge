// Sorted array binary search
public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {12, 13, 14, 15, 16};
        int toFind1 = 13;
        System.out.println(binarySearch1(arr1, toFind1));

        int[] arr2 = {16, 15, 14, 13, 12};
        int toFind2 = 13;
        System.out.println(binarySearch2(arr2, toFind2));

        int[] arr3 = {12, 13, 14, 15, 16};
        int toFind3 = 16;
        System.out.println(binarySearch3(arr3, toFind3));
    }

    // For Ascending Sorted array
    static int binarySearch1(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }

    // For Decsending sorted arrray
    static int binarySearch2(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) end = mid - 1;
            else if (target < arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }

    // Order-Agnostic => Dont know if the array is in ascending or descending order, but its sorted.
    static int binarySearch3(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid;
            if (isAsc){         
                if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
            else{
                if (target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}