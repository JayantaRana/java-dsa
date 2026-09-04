public class palindrome {

    public static boolean checkpalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int s = str.length();
            if (str.charAt(i) != str.charAt(s - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String name = "ababab";
        System.out.println(checkpalindrome(name));

    }
}
