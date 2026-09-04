// Problem: Find the length of the longest consecutive sequence in an array. 
// Example: 
// Input: [100, 4, 200, 1, 3, 2] 
// Output: 4 (Sequence: [1, 2, 3, 4])

import java.util.HashSet;

public class LongestConsecutive {
    public static int longestConscutive(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements to HashSet
        for (int num : arr) {
            set.add(num);
        }

        int longestLength = 0;
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }
                longestLength = Math.max(longestLength, length);
            }
        }
        return longestLength;

    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 2, 3, 1 };

        System.out.println(longestConscutive(arr));
    }
}
