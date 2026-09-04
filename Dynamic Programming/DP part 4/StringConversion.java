public class StringConversion {
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        // initialization -> java by default store 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {// same
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }

    public static void stringCoversion(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int totalDel = n - lcs(str1, str2);
        System.out.println("Delete oper: " + totalDel);

        int totalAdd = m - lcs(str1, str2);
        System.out.println("Insertion oper: " + totalAdd);

        int totalOpe = totalAdd + totalDel;
        System.out.println("Total operation: " + totalOpe);
    }

    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        stringCoversion(str1, str2);

    }
}