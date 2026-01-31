// Binary Search for an infinite array (assumed)
public class BinarySearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,15,16,20,22,24,26,28,30};
        int toFind = 28;
        System.out.println(ans(arr, toFind));
    }

    static int ans (int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int newStart = end + 1;
            // Array size if being found here by the bracket logic, and by updating end by this formula, it will grow exponentially
            end = end + (start - end + 1) * 2;   // Logic is size of new array will be: end - (start -1) => end - start + 1
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
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