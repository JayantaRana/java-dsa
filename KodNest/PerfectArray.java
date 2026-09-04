
public class PerfectArray {
    public static boolean isPerfect(int[] arr) {
        int n = arr.length;
        if (n < 2)
            return false;

        int i = 0;

        // Phase 1: Strictly Increasing
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Edge case: All elements are same
        if (i == 0 && arr[0] == arr[n - 1]) {
            return true;
        }

        // Phase 2: Constant
        while (i < n - 1 && arr[i] == arr[i + 1]) {
            i++;
        }

        // Phase 3: Strictly Decreasing
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        // If reached end, it's perfect
        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 8, 8, 8, 3, 2 }; // Yes
        int[] arr2 = { 1, 1, 2, 2, 1 }; // No
        int[] arr3 = { 4, 4, 4, 4 }; // Yes

        System.out.println(isPerfect(arr1) ? "Yes" : "No");
        System.out.println(isPerfect(arr2) ? "Yes" : "No");
        System.out.println(isPerfect(arr3) ? "Yes" : "No");
    }
}
