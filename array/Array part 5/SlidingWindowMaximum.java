import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static int[] maxBrute(int arr[], int k) {
        int n = arr.length;
        int result[] = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            result[i] = max;
        }
        return result;
    }

    // using deque
    public static int[] maxBest(int arr[], int k) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        // process first k element
        dq.addLast(0);
        for (int i = 1; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.getLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        result.add(arr[dq.getFirst()]);

        // process remaining elements
        for (int i = k; i < n; i++) {

            // remove elements out of window
            // while (i - dq.getFirst() >= k) {
            // dq.removeFirst();
            // }

            while (dq.size() > 0 && dq.getFirst() <= i - k) {
                dq.removeFirst();
            }
            // remove smaller elements
            while (!dq.isEmpty() && arr[i] >= arr[dq.getLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
            result.add(arr[dq.getFirst()]);
        }

        // convert list to arr
        int res[] = new int[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int arr[] = { 5, -1, 0, 9, -4, 7, 1 };
        int k = 3;
        int res[] = maxBrute(arr, k);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }
}
