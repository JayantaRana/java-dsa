package Infosys;

public class MinimumOperationstoReduceNto1DP {
    public static int dp(int n, int x, int y, int z) {
        int dp[][] = new int[n + 1][2];

        // initialization
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = 0;
            }
        }

        dp[1][0] = 0;
        dp[1][1] = 0;
        for (int i = 2; i < dp.length; i++) {

            // if divided only substract
            dp[i][1] = x + dp[i - 1][0];

            // if not not divided
            dp[i][0] = x + dp[i - 1][0];

            if (i % 2 == 0) {
                dp[i][0] = Math.min(dp[i][0], y + dp[i / 2][1]);
            }
            if (i % 3 == 0) {
                dp[i][0] = Math.min(dp[i][0], z + dp[i / 3][1]);
            }

        }
        return (int) dp[n][0];
    }

    public static void main(String[] args) {
        System.out.println(dp(10, 1, 2, 3));
    }
}
