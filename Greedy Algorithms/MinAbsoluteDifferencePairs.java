import java.util.Arrays;

//TC: O(nlogn)
public class MinAbsoluteDifferencePairs {
    public static void main(String[] args) {
        int a[] = { 4, 1, 8, 7 }; // ans = 6
        int b[] = { 2, 3, 6, 5 };

        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;

        int minDiff = 0;
        for (int i = 0; i < n; i++) {
            minDiff += Math.abs(a[i] - b[i]);
        }

        System.out.println("Ans " + minDiff);
    }
}
