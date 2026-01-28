public class BasicLinearSearchInStrings {
    public static void main(String[] args) {
        String name = "Zom";
        char Target = 'o';

        int ans = search(name, Target);
        System.out.println(ans);

        System.out.println(search2(name, Target));
    }

    static int search(String Value, char hunt){
        for (int i = 0; i < Value.length(); i++) {
            if (hunt == Value.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    static boolean search2(String Value, char hunt){
        for (char ch : Value.toCharArray()) {
            if (ch == hunt) {
                return true;
            }
        }
        return false;
    }
}