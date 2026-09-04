//Type 2: Longest Subarray  or substring ⭐⭐⭐ TC = O(N + N) and SC = O(1)

public class LongestSubArray {
    public static int longSubArray(int arr[], int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sum = 0;

        while (right < arr.length) {
            sum = sum + arr[right];

            while (sum > k) {
                sum = sum - arr[left];
                left = left + 1;
            }
            if (sum <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
                right = right + 1;
            }
        }
        return maxLen;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 7, 10 };
        int k = 14;
        System.out.println(longSubArray(arr, k));

    }
}

// if ask for subarray with max length
// public class LongestSubArray {

// public static void longSubArray(int arr[], int k) {

// int left = 0;
// int right = 0;
// int sum = 0;

// int maxLen = 0;
// int start = 0;
// int end = 0;

// while (right < arr.length) {

// sum += arr[right];

// while (sum > k) {
// sum -= arr[left];
// left++;
// }

// if (right - left + 1 > maxLen) {
// maxLen = right - left + 1;
// start = left;
// end = right;
// }

// right++;
// }

// System.out.println("Maximum Length = " + maxLen);

// System.out.print("Subarray: ");
// for (int i = start; i <= end; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {

// int arr[] = {2, 5, 1, 7, 10};
// int k = 14;

// longSubArray(arr, k);
// }
// }