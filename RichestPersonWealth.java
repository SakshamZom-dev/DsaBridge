// Here, a row defines the amount of money in someones' banks of 3 people, which are taken as grid here.
// The person with the most amount would get returned in terms of the total amount he has combined.
public class RichestPersonWealth {
    public static void main(String[] args) {
        int[][] money = {
            {1, 2, 3}, {12, 45, 1}, {3, 6, 1}
        };
        System.out.println(mostMoney(money));
        System.out.println(mostMoney2(money));
    }

    static int mostMoney(int arr[][]){
        int most = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > most) most = sum;
        }
        return most;
    }

    // Enhanced loop
    static int mostMoney2(int arr[][]){
        int most = Integer.MIN_VALUE;
        for (int[] person : arr) {
            int sum = 0;
            for (int account : person) {
                sum += account;
            }
            if (sum > most) most = sum;
        }
        return most;
    }
}