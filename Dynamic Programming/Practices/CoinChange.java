// What is the minimum number of coins needed to make the amount?
//leetcode: 322
package Practices;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n + 1][amount + 1];

        // initialization
        for (int j = 0; j < amount + 1; j++) {
            dp[0][j] = amount + 1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                int v = coins[i - 1];

                if (v <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j - v], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        if (dp[n][amount] == amount + 1) {
            return -1;
        }
        return dp[n][amount];
    }

    public static void main(String[] args) {
        int coins[] = { 1, 2, 5 };
        int amount = 11;
        System.out.println(coinChange(coins, amount));
        // ans: 3 {5+5+1}
    }
}
