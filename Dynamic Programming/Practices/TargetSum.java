//leetcode 494
package Practices;

public class TargetSum {
    public static int solve(int nums[], int target, int index, int currSum) {
        if (index == nums.length) {
            if (currSum == target) {
                return 1;
            }
            return 0;
        }

        // + choice
        int plus = solve(nums, target, index + 1, currSum + nums[index]);
        // - choice
        int minus = solve(nums, target, index + 1, currSum - nums[index]);

        return plus + minus;
    }

    public static int findTargetSumWays(int[] nums, int target) {
        return solve(nums, target, 0, 0);
    }

    public static void main(String[] args) {

    }
}
