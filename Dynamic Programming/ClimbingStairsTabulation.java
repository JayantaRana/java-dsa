//TC: O(n)

public class ClimbingStairsTabulation {

    public static int ways(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        // tabulation loop
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(ways(n));

    }
}
