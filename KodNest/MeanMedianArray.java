// Input: arr[] = [1, 2, 19, 28, 5]
// Output: 11 5
// Explanation: Sorted array - [1, 2, 5, 19, 28], Mean = (1 + 2 + 19 + 28 + 5) / 5 = 55 / 5 = 11, Median = Middle element = 5

// Input: arr[] = [2, 8, 3, 4]
// Output: 4 3
// Explanation: Sorted array - [2, 3, 4, 8], Mean = (2 + 3 + 4 + 8) / 4 = 17 / 4 = 4.25, so floor(4.25) is 4, Median = (3 + 4)/2 = 3.5, so floor(3.5) is 3

import java.util.Arrays;

public class MeanMedianArray {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 19, 28, 5 };
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Mean = " + sum / len);

        // for even case
        Arrays.sort(arr);
        int result = 0;
        if (len % 2 == 0) {
            result = (arr[len / 2] + arr[(len / 2) - 1]) / 2;
        } else {
            result = arr[len / 2];
        }
        System.out.println("Median " + result);
    }
}
