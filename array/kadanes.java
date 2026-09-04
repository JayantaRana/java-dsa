package array;

import java.util.*;// maximum subarray sum

public class kadanes {

    // this work for all negetive /positive elements
    public int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currsum = Math.max(currsum + nums[i], nums[i]);

            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum;
    }

    // this not work for all negative elments
    public static void Kadanes(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("maximum subarray is " + ms);
    }

    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int arr[] = { -1, -3, -4 };
        Kadanes(arr);
    }
}
