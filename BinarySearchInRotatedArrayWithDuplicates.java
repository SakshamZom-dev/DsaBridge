// Binary Search in a Rotated array containing duplicates by finding pivot (peak) using order Binary search
// Not Practiced (Just written correctly)
public class BinarySearchInRotatedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int toFind = 1;
        System.out.println(search(arr, toFind));
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        if (pivot == -1) return binarySearch(nums, target, 0, nums.length -1);
        if (nums[pivot] == target) return pivot;
        if (target >= nums[0]) return binarySearch(nums, target, 0, pivot - 1);
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Standard pivot checks
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;

            // If elements at start, mid, end are equal, skip duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // Check if start is the pivot before skipping
                if (start < end && arr[start] > arr[start + 1]) return start;
                start++;

                // Check if end-1 is the pivot before skipping
                if (end > start && arr[end] < arr[end - 1]) return end - 1;
                end--;
            }
            // Left side is sorted, so pivot must be in the right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int arr[], int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}