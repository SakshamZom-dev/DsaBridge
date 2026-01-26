import java.util.Scanner;
public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Write all the 5 elements of the array you want to find the max value of:");
        int arr1[] = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("\nYour Array:\t");
        for (int i : arr1) {
            System.out.print(" " + i);
        }

        System.out.println("\n");
        System.out.println("The max value out of your given array is:\t " + maxVal(arr1));
        
        sc.close();
    }

    static int maxVal(int arr[]){
        int maxima = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxima) {
                maxima = arr[i];
            }
        }
        return maxima;
    }
}