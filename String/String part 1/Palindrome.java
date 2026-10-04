public class Palindrome {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        String str1 = "";
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                str1 += Character.toLowerCase(ch);
            }
        }
        String str2 = str1;
        StringBuilder sb = new StringBuilder(str1);
        str1 = sb.reverse().toString();

        return str1.equals(str2);
    }

    public static boolean isPalindromeBetter(String str) {
        int n = str.length();
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            } else if (Character.toLowerCase(str.charAt(left)) == Character.toLowerCase(str.charAt(right))) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal:panama";
        System.out.println(isPalindromeBetter(str));
    }
}
