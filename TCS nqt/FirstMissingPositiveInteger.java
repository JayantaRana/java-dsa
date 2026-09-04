// Problem: Find the smallest positive number missing from an unsorted array. 
// Example: 
// Input: [3, 4, -1, 1] 
// Output: 2

public class FirstMissingPositiveInteger {
    public static int fineMissingPositive(int arr[]) {
        boolean present[] = new boolean[arr.length + 1];

        // Mark the present numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && i <= arr.length) {
                present[arr[i]] = true;
            }
        }

        // Find the first missing positive
        for (int i = 1; i < present.length; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return arr.length + 1;

    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 0 };
        int arr[] = { 3, 4, -1, 1 };
        System.out.println(fineMissingPositive(arr));
    }
}
