//longest common subsequence

public class LongestComSubTabulation {

    public static int lcs(String str1, String str2, int n, int m) {
        int dp[][] = new int[n + 1][m + 1];
        // base case
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];

        // if (str1.charAt(n - 1) == str2.charAt(m - 1)) { // same
        // return dp[n][m] = lcs(str1, str2, n - 1, m - 1, dp) + 1;
        // }
        // return dp[n][m] = Math.max(lcs(str1, str2, n - 1, m, dp), lcs(str1, str2, n,
        // m - 1, dp)); // diff
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abc";
        int n = str1.length();
        int m = str2.length();

        System.out.println(lcs(str1, str2, n, m));
    }
}
