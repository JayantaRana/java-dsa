public class SubArraySumEqualsK {

    // tc: O(n^2) sc: O(1)
    public static int sumBrute(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    // tc: O(n) sc: O(n)
    public static void sumBest(int arr[], int k) {

    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 5, 2 };
        int k = 4;
        System.out.println(sumBrute(arr, k));
    }
}
