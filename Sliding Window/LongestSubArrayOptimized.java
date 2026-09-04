
public class LongestSubArrayOptimized {
    public static int longSubArray(int arr[], int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sum = 0;

        while (right < arr.length) {
            sum = sum + arr[right];

            if (sum > k) {
                sum = sum - arr[left];
                left = left + 1;
            }
            // if (sum <= k) {
            // maxLen = Math.max(maxLen, right - left + 1);
            // right = right + 1;
            // }
            maxLen = Math.max(maxLen, right - left + 1);
            right = right + 1;
        }
        return maxLen;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 7, 10 };
        int k = 14;
        System.out.println(longSubArray(arr, k));

    }
}
