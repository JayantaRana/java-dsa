import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int nums[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int sec = target - first;

            if (map.containsKey(sec)) {
                result[0] = map.get(sec);
                result[1] = i;
                break;
            }
            map.put(first, i);

        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 11, 7, 15 };
        int result[] = twoSum(arr, 9);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
