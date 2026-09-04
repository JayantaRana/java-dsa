package array;

import java.util.Arrays;

public class Practice {

    public static void practice(int arr[]) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
                ;
            }
            maxsum = Math.max(currSum, maxsum);
        }

        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, -3, 4, -1, -2, 1, 5, -3 };

        practice(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

    }
}