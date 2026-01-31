// Binary Search for finding the peak index of mountain
public class PeakIndexUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {  // descending
                end = mid;
            }
            else {  // ascending
                start = mid + 1;
            }
        }
        return start;   // As start and end are pointing on the same index, we are taking one of them as output
    }
}