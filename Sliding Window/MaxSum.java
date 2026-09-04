//Type 1: constant window size k

public class MaxSum {

    public static int maxSum(int arr[], int k) {
        int left = 0;
        int right = k - 1;
        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum += arr[i];
        }

        int maxSum = sum;
        while (right < arr.length - 1) {
            sum = sum - arr[left];
            left++;
            right++;
            sum = sum + arr[right];
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        System.out.println(maxSum(arr, k));

    }
}
