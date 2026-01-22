import java.util.Scanner;
import java.util.Arrays;
public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int arr[] = {12,32,43,35,56,65};
        // System.out.println(arr[1]);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        // System.out.println(Arrays.toString(arr));

        // int newArr[][] = {
        //     {1, 2, 3, 4},
        //     {4, 5, 6},
        //     {7, 8, 9, 2}
        // };
        // System.out.println();

        // String str[] = new String[4];
        // System.out.println("Enter the 4x0 string array");
        // for (int i = 0; i < str.length; i++) {
        //     str[i] = sc.next();
        // }
        // System.out.println(Arrays.toString(str));
    
        // System.out.println();
        // for (int i = 0; i < newArr.length; i++) {
        //     for (int j = 0; j < newArr[i].length; j++) {
        //         System.out.print(newArr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println("Enter the 3x2 array");
        System.out.println();
        int theNewArr[][] = new int[3][2];
        for (int row = 0; row < theNewArr.length; row++) {
            for (int col = 0; col < theNewArr[row].length; col++) {
                theNewArr[row][col] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(theNewArr));

        System.out.println();
        for (int i = 0; i < theNewArr.length; i++) {
            for (int j = 0; j < theNewArr[i].length; j++) {
                System.out.print(theNewArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < theNewArr.length; i++) {
            System.out.println(Arrays.toString(theNewArr[i]));
        }

        sc.close();
    }
}