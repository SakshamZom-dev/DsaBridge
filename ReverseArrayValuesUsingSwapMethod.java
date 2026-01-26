public class ReverseArrayValuesUsingSwapMethod {
    public static void main(String[] args) {

        System.out.println();
        int newArr[] = {12, 45, 46, 33, 34, 19};
        System.out.println("Orignal Value:\t ");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        reverseArray(newArr);
        System.out.println();
        System.out.println("Reversed Array:\t ");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;        
    }

    static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}