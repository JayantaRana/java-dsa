//KodNest 

//nums: A binary array of size n containing Os and 1s.
//k: An integer representing the maximum number of Os that can be changed into 1s.
// Returns
// An integer representing the length of the longest contiguous sequence of 1s that can be
// achieved.

public class MaxConsecutiveOnes {

    public static int longestOnes(int arr[], int k) {

        int left = 0;
        int maxLen = Integer.MIN_VALUE;
        int zeroCount = 0;
        for (int right = 0; right < arr.length; right++) {

            if (arr[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 1, 0, 0, 1, 1, 1, 0 };
        int arr[] = { 0, 0, 0 };
        int k = 2;
        int result = longestOnes(arr, k);
        System.out.println("Answer: " + result);
    }

}

// 📍Broute Force

// public class MaxConsecutiveOnes {

// public static int longestOnes(int arr[], int k) {

// int maxLen = Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {

// int zeroCount = 0;
// for (int j = i; j < arr.length; j++) {

// if (arr[j] == 0) {
// zeroCount++;
// }

// if (zeroCount > k) {
// break;
// }
// maxLen = Math.max(maxLen, j - i + 1);
// }
// }
// return maxLen;
// }

// public static void main(String[] args) {
// int arr[] = { 1, 1, 0, 0, 1, 1, 1, 0 };
// int k = 2;
// int result = longestOnes(arr, k);
// System.out.println("Answer: " + result);
// }

// }