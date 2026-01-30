public class CeilingAndFloorUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15, 16, 18, 19, 20};
        int toFind = 17;
        System.out.println("The Ceiling no. index is \t" + ceilingNum(arr, toFind));
        System.out.println("The Floor no. index is \t" + floorNum(arr, toFind));
    }

    static int ceilingNum(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return start;
    }

    static int floorNum(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return end;
    }
}