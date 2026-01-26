import java.util.Scanner;
public class SwapValuesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        int newArr[] = {12, 45, 46, 33, 34, 19};
        System.out.println("Orignal Value:\t ");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Enter the index you want to replace:\t ");
        int in1 = sc.nextInt();

        System.out.println("Enter the index you want your value to get replaced with:\t ");
        int in2 = sc.nextInt();

        swap(newArr, in1, in2);
        System.out.println();
        System.out.println("Swapped Value:\t ");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;        
    }
}