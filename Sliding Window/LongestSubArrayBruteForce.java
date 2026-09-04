
public class LongestSubArrayBruteForce {

    public static int longSum(int arr[], int k) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else if (sum > k) {
                    break;
                }

            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 7, 10 };
        int k = 14;
        System.out.println(longSum(arr, k));
    }
}
