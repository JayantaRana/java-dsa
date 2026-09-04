import java.util.HashMap;

public class SumofUniqueElement {

    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Sum only those with count 1
        int sum = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                sum += key;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1, 4 };
        System.out.println(sumOfUnique(arr));
    }
}
