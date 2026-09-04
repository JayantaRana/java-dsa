package Practices;

public class HouseRober {
    public static int houseRob(int nums[]) {
        int dp[] = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }

        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 2 };
        System.out.println(houseRob(arr));
    }
}
