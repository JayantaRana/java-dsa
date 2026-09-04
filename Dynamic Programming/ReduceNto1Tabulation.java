class ReduceNto1Tabulation {
    // public int solve(int N, int X, int Y, int Z) {

    // int INF = Integer.MAX_VALUE / 2;

    // // dp[i][0] -> previous operation was NOT division
    // // dp[i][1] -> previous operation WAS division
    // int[][] dp = new int[N + 1][2];

    // for (int i = 0; i <= N; i++) {
    // dp[i][0] = INF;
    // dp[i][1] = INF;
    // }

    // dp[1][0] = 0;

    // for (int i = 2; i <= N; i++) {

    // // Subtraction is always allowed.
    // // After subtraction, previous operation becomes "not division".
    // dp[i][0] = X + Math.min(dp[i - 1][0], dp[i - 1][1]);

    // // Division is allowed only if previous operation
    // // was NOT division.
    // if (i % 2 == 0) {
    // dp[i][1] = Math.min(
    // dp[i][1],
    // Y + dp[i / 2][0]);
    // }

    // if (i % 3 == 0) {
    // dp[i][1] = Math.min(
    // dp[i][1],
    // Z + dp[i / 3][0]);
    // }
    // }

    // return Math.min(dp[N][0], dp[N][1]);
    // }

    public static int solve(int n, int x, int y, int z) {

        long[][] dp = new long[n + 1][2];

        // Base case
        dp[1][0] = 0;
        dp[1][1] = 0;

        for (int i = 2; i <= n; i++) {

            // Previous operation was division.
            // So we MUST subtract.
            dp[i][1] = x + dp[i - 1][0];

            // Previous operation was not division.
            // So subtraction is always possible.
            dp[i][0] = x + dp[i - 1][0];

            // Divide by 2
            if (i % 2 == 0) {
                dp[i][0] = Math.min(
                        dp[i][0],
                        y + dp[i / 2][1]);
            }

            // Divide by 3
            if (i % 3 == 0) {
                dp[i][0] = Math.min(
                        dp[i][0],
                        z + dp[i / 3][1]);
            }
        }

        print(dp);
        return (int) dp[n][0];
    }

    public static void print(long dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i][0] + " " + dp[i][1]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(solve(4, 1, 2, 3));

    }
}
