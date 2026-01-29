// DemoCode file (For Execution check & Testings)

// Sorted array binary search
public class DemoCode {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15, 16};
        int toFind = 13;
        System.out.println(BinarySearch(arr, toFind));
    }

    static int BinarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = start + 1;
            else return mid;
        }
        return -1;
    }
}