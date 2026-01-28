public class CountOfEvenDigitNumsInArray {
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
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count % 2 == 0;
    }
}