// DemoCode file (For Execution check & Testings)

// Binary Search
public class DemoCode {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int toFind = 1;
        System.out.println(search(arr, toFind));
    }

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if (pivot == -1) return binarySearch(arr, target, 0, arr.length -1);
        if (arr[pivot] == target) return pivot;
        if (target >= arr[0]) return binarySearch(arr, target, 0, pivot - 1);
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int findPivot (int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = (arr[start] < arr[end]);
        while (start <= end) {
            int mid = start + (end - start) /2;
            if (arr[mid] == target) return mid;
            if (isAsc) {
                if (arr[mid] < target) start = mid + 1;
                else end = mid - 1;
            }
            else {
                if (arr[mid] < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}