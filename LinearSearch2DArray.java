import java.util.Arrays;
public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] newArr = {
            {12, 23, 36, 98},
            {89, 20, 45}, 
            {44, 56, 23, 7},
            {4, 2, 6}
        };

        System.out.println();
        System.out.println("The given Array is:");
        view(newArr);
        
        System.out.println();
        int target = 44;
        System.out.println("Is there "+ target + " in the array?\t" + search(newArr, target));

        System.out.println();
        int ans[] = search2(newArr, target);
        System.out.println(Arrays.toString(ans));
    }

    static void view(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean search(int arr[][], int hunt){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == hunt) {
                    return true;
                }
            }
        }
        return false;
    }

    static int[] search2(int arr[][], int hunt){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == hunt) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}