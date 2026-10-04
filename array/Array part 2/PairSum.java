
public class PairSum {
    public static int[] pairSumBrute(int nums[], int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    // best approach -> Two pointer
    public static int[] pairSum(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;

        int result[] = new int[2];
        while (start < end) {
            int sum = nums[start] + nums[end];

            if (target > sum) {
                start++;
            } else if (sum > target) {
                end--;
            } else {
                result[0] = start;
                result[1] = end;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 11, 5, 7 };
        int result[] = pairSum(arr, 9);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
