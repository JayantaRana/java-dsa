package Practices;

//leetcode 845
public class MountainRanges {

}

class Solution {

    public int longestMountain(int[] arr) {

        int n = arr.length;

        if (n < 3) {
            return 0;
        }

        // inc[i] = increasing sequence ending at i
        int[] inc = new int[n];
        inc[0] = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                inc[i] = inc[i - 1] + 1;
            } else {
                inc[i] = 1;
            }
        }

        // dec[i] = decreasing sequence starting at i
        int[] dec = new int[n];
        dec[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                dec[i] = dec[i + 1] + 1;
            } else {
                dec[i] = 1;
            }
        }

        int maxLen = 0;

        // Find possible peaks
        for (int i = 0; i < n; i++) {

            if (inc[i] > 1 && dec[i] > 1) {

                int mountainLength = inc[i] + dec[i] - 1;

                maxLen = Math.max(maxLen, mountainLength);
            }
        }

        return maxLen;
    }
}
