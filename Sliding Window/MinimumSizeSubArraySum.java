//KodNest problem  //  Time complexitiy: O(n)

//given the sales data [2, 3, 1, 2, 4, 3] and a target sales amount of 7, the
// smallest subarray that sums up to at least 7 is [4, 3], with a length of 2.
// Your task is to find the minimum length of a contiguous subarray whose sum is greater than
// or equal to the target sales amount. If no such subarray exists, return 0.

public class MinimumSizeSubArraySum {

    public static int minSum(int arr[], int k) {
        int left = 0;
        int minSize = Integer.MAX_VALUE;
        int sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum = sum + arr[right];

            while (sum >= k) {
                minSize = Math.min(minSize, right - left + 1);
                sum = sum - arr[left];
                left++;
            }

        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 4, 3 };
        int k = 7;
        int result = minSum(arr, k);
        System.out.println("Minimum window size: " + result);
    }
}

// 📍 Broute force
// public class MinimumSizeSubArraySum {

// public static int minSum(int arr[], int k) {
// int minSize = Integer.MAX_VALUE;

// for (int i = 0; i < arr.length; i++) {
// int sum = 0;
// for (int j = i; j < arr.length; j++) {
// sum = sum + arr[j];
// if (sum >= k) {
// minSize = Math.min(minSize, j - i + 1);
// break;
// }
// }
// }
// return minSize == Integer.MAX_VALUE ? 0 : minSize;
// }

// public static void main(String[] args) {
// int arr[] = { 2, 3, 1, 2, 4, 3 };
// int k = 7;
// int result = minSum(arr, k);
// System.out.println("Minimum window size: " + result);
// }
// }
