// Comparitively optimised and much faster.
// log10 of a no. gives output of 1 less digit than that of input.
// so log10 + 1 is taken, so it gives accurate digit.
// This is an easier and less compolex solution of the problem.

public class CountOfEvenDigitNumsInArray2 {
    public static void main(String[] args) {
        int[] newArray = {12, 415, 7128, 136, 5204, 8};
        System.out.println(howMuchEvenDigitNums(newArray));
    }
    
    static int howMuchEvenDigitNums(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEvenDigitNum(arr[i])) count++;
        }
        return count;
    }

    static boolean isEvenDigitNum(int num) {
        if (num == 0) return false;         
        if (num < 0) num = num * -1;
        int count = (int)(Math.log10(num)) + 1;  // This line
        return count % 2 == 0;
    }
}