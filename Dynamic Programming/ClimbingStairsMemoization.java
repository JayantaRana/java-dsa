import java.util.Arrays;
//TC: O(n)

public class ClimbingStairsMemoization {

    public static int ways(int n, int w[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (w[n] != -1) {
            return w[n];
        }
        w[n] = ways(n - 1, w) + ways(n - 2, w);

        return w[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int w[] = new int[n + 1];
        Arrays.fill(w, -1);
        System.out.println(ways(n, w));
    }
}
