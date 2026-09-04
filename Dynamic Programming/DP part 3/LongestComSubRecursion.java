public class LongestComSubRecursion {

    public static int lcs(String str1, String str2, int n, int m) {
        // base case
        if (n == 0 || m == 0) {
            return 0;
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return lcs(str1, str2, n - 1, m - 1) + 1;
        }
        return Math.max(lcs(str1, str2, n - 1, m), lcs(str1, str2, n, m - 1));
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abc";
        int n = str1.length();
        int m = str2.length();

        System.out.println(lcs(str1, str2, n, m));
    }
}
