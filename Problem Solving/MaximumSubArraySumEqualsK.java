import java.util.HashMap;

public class MaximumSubArraySumEqualsK {

    public static int findArray(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int sum = 0;
        int count = 0;

        map.put(0, 1);

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            int val = sum - k;

            count += map.getOrDefault(val, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4 };
        int k = 6;
        System.out.println(findArray(arr, k));
    }
}
