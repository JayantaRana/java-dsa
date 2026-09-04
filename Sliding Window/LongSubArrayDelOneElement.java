//KodNest problem TC -> O(N)

//if nums = [1, 1, 0, 1], deleting the 0 gives the subarray [1, 1, 1] with a length of 3.
// If no deletions are needed, the subarray's length should be returned by default, but at least
// one element must be removed.
public class LongSubArrayDelOneElement {
    public static int longestSubArray(int arr[]) {

        int zeroCount = 0;
        int maxLen = Integer.MIN_VALUE;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            if (arr[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        // int arr[] = { 0, 1, 1, 1, 0, 1 };
        int arr[] = { 1, 1, 1, 1 };
        int result = longestSubArray(arr);
        System.out.println("Answer: " + result);
    }
}

// 📍BruteForce
// public class LongSubArrayDelOneElement {
// public static int longestSubArray(int arr[]) {

// int maxLen = Integer.MIN_VALUE;

// for (int i = 0; i < arr.length; i++) {
// int zeroCount = 0;
// for (int j = i; j < arr.length; j++) {
// if (arr[j] == 0) {
// zeroCount++;
// }

// if (zeroCount > 1) {
// break;
// }
// maxLen = Math.max(maxLen, j - i);
// }
// }
// return maxLen;
// }

// public static void main(String[] args) {
// int arr[] = { 0, 1, 1, 1, 0, 1 };
// int result = longestSubArray(arr);
// System.out.println("Answer: " + result);
// }
// }
