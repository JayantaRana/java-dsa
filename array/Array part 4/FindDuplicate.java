import java.util.HashSet;

public class FindDuplicate {
    // tc:O(n) sc:O(n)
    public static int findBetter(int arr[]) {
        // using set
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return arr[i];
            }
            set.add(arr[i]);
        }

        return -1;
    }

    // using slow-fast
    public static int findBest(int arr[]) {
        int slow = arr[0];
        int fast = arr[0];

        // find loop
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // reset slow to start
        slow = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 3, 3, 3 };
        System.out.println(findBetter(arr));
    }
}
