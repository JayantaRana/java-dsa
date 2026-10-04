import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindMissingandRepeatingNumber {
    public static int[] findMissingAndRepeatedValues(int arr[][]) {
        int n = arr.length;
        int repVal = 0;
        Set<Integer> set = new HashSet<>();
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = arr[i][j];
                actualSum += val;
                // map.put(val, map.getOrDefault(val, 0) + 1);
                if (set.contains(val)) {
                    repVal = val;
                }
                set.add(val);
            }
        }

        // for (int num : map.keySet()) {
        // if (map.get(num) == 2) {
        // repVal = num;
        // }
        // }

        int n2 = n * n;
        int expectedSum = (n2 * (n2 + 1)) / 2;
        // int sum2 = actualSum - repVal;
        int missing = expectedSum - actualSum + repVal;
        int arrRes[] = new int[2];
        arrRes[0] = repVal;
        arrRes[1] = missing;

        return arrRes;

    }

    public static void main(String[] args) {
        int arr[][] = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };

        int result[] = findMissingAndRepeatedValues(arr);
        System.out.println("a = " + result[0] + " and b = " + result[1]);
    }
}
