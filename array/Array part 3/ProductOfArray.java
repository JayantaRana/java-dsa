import java.util.Arrays;

public class ProductOfArray {

    // brute force/ native tc: O(n^2)
    public static int[] productArrayBrute(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            int val = 1;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    val = val * arr[j];
                }
            }
            ans[i] = val;
        }

        return ans;

    }

    // better approach
    public static int[] productArrayBetter(int arr[]) {
        int n = arr.length;
        int zeroCount = 0;
        int mul = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                mul *= arr[i];
            }

        }

        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if (zeroCount == 0) {
                    ans[i] = mul / arr[i];
                } else {
                    ans[i] = 0;
                }
            } else {
                if (zeroCount == 1) {
                    ans[i] = mul;
                } else {
                    ans[i] = 0;
                }
            }
        }

        return ans;
    }

    // best approach

    public static int[] productArrayBest(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];

        // // prefix arr
        // int pref[] = new int[n];
        // pref[0] = 1;
        // for (int i = 1; i < n; i++) {
        // pref[i] = pref[i - 1] * arr[i - 1];
        // }

        // // suffix
        // int suff[] = new int[n];
        // suff[n - 1] = 1;
        // for (int i = n - 2; i >= 0; i--) {
        // suff[i] = suff[i + 1] * arr[i + 1];
        // }

        // for (int i = 0; i < n; i++) {
        // ans[i] = pref[i] * suff[i];
        // }
        // return ans;

        // optimized for space
        Arrays.fill(ans, 1);
        // prefix arr
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * arr[i - 1];
        }

        // suffix
        int suff = 1;
        for (int i = n - 2; i >= 0; i--) {
            suff *= arr[i + 1];
            ans[i] *= suff;
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int result[] = productArrayBest(arr);

        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
