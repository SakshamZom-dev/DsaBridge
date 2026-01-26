import java.util.Scanner;

public class BasicLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        int newArr[] = {12, 45, 46, 33, 34, 19};
        System.out.println("Orignal Value:\t ");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Write the number you want to hunt for? ");
        int a = sc.nextInt();

        int resultIndex = search(newArr, a);
        if (resultIndex != -1) System.out.println("Target found at index: " + resultIndex);
        else System.out.println("Target not found in the array.");

        sc.close();
    }

    static int search(int arr[], int hunt){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == hunt) {
                return i;
            }
        }
        return -1;
    }
}