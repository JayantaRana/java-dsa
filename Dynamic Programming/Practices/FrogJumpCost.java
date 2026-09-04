package Practices;

public class FrogJumpCost {
    public static int minCost(int[] height) {
        // code here
        int dp[] = new int[height.length];
        dp[0] = 0;
        for (int i = 1; i < height.length; i++) {
            if (i == 1) {
                dp[i] = Math.abs(height[i] - height[i - 1]);
            } else {
                dp[i] = Math.min(dp[i - 1] + Math.abs(height[i] - height[i - 1]),
                        dp[i - 2] + Math.abs(height[i] - height[i - 2]));
            }
        }

        return dp[dp.length - 1];

    }

    public static void main(String[] args) {
        int arr[] = { 20, 30, 40, 20 };
        System.out.println(minCost(arr));
    }
}
