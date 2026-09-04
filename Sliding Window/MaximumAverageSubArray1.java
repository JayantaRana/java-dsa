//KodNest

// Return the maximum average score of such a subarray as a floating-point number.

// For example, if nums = [1, 12, -5, -6, 50, 3] and k = 4, the subarray [12, -5, -6, 50] has
// the maximum average, which is 12.75.

public class MaximumAverageSubArray1 {

    public static double findMaxAverage(int arr[], int k) {
        int left = 0;
        int right = k - 1;

        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum += arr[i];

        }
        int maxSum = sum;

        // for (int i = k; i < arr.length; i++) {
        // sum = sum - arr[i - k] + arr[i];
        // maxSum = Math.max(maxSum, sum);
        // }

        while (right < arr.length - 1) {
            sum -= arr[left];
            left++;
            right++;
            sum += arr[right];
            maxSum = Math.max(sum, maxSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println("Maximum Average score: " + findMaxAverage(arr, k));
    }
}
