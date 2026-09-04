package array;

public class KadanesAlgorithm {
    public static int maxSubArraySum(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxSum = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum subarray sum is: " + maxSum); // Output: -1
    }
}
