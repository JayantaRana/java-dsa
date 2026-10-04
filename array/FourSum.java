package array;

import java.util.*;

public class FourSum {

    // Broute force/native TC:O(n^4) sc: O(K)
    public static List<List<Integer>> fourSumBroute(int nums[], int target) {

        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum == target) {
                            set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }
        }

        result.addAll(set);
        return result;
    }

    // Better Approach tc: O(n^3 log(k)) sc: O(k)
    public static List<List<Integer>> fourSumBetter(int nums[], int target) {

        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                long val = (long) (target - nums[i] - nums[j]);

                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum == val) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (sum > val) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        result.addAll(set);
        return result;

    }

    // optimal approach tc:O(n^3) sc: O(1)
    public static List<List<Integer>> fourSumBest(int nums[], int target) {

        int n = nums.length;
        Arrays.sort(nums); // Step 1: Sort the array
        List<List<Integer>> result = new ArrayList<>();

        // Loop for the first number
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // Skip duplicates

            // Loop for the second number
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue; // Skip duplicates

                long remainingTarget = (long) target - nums[i] - nums[j];
                int left = j + 1, right = n - 1;

                // Two-pointer search for remaining two numbers
                while (left < right) {
                    int sum = nums[left] + nums[right];

                    if (sum < remainingTarget) {
                        left++;
                    } else if (sum > remainingTarget) {
                        right--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates
                        // int prevLeft = nums[left], prevRight = nums[right];
                        // while (left < right && nums[left] == prevLeft)
                        // left++;
                        // while (left < right && nums[right] == prevRight)
                        // right--;

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;

                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };
        int terget = 0;
        System.out.println(fourSumBest(nums, terget));
    }

}
