package Practices;

public class MinimumCostStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n + 1];

        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }

        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int cost[] = { 10, 15, 20 };
        System.out.println(minCostClimbingStairs(cost));
    }
}
