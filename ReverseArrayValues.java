public class ReverseArrayValues {
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

    static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}