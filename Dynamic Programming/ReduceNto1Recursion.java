public class ReduceNto1Recursion {
    public static int minimumCost(int n, int x, int y, int z, boolean previousWasDivision) {
        if (n == 1) {
            return 0;
        }
        if (previousWasDivision) {
            return x + minimumCost(n - 1, x, y, z, false);
        }
        // option 1 > substraction
        int minCost = x + minimumCost(n - 1, x, y, z, false);

        // option 2 > divide by 2
        if (n % 2 == 0) {
            int cost = y + minimumCost(n / 2, x, y, z, true);
            minCost = Math.min(minCost, cost);
        }

        // option 3 > divide by 3
        if (n % 3 == 0) {
            int cost = z + minimumCost(n / 3, x, y, z, true);
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }

    public static int solve(int n, int x, int y, int z) {
        return minimumCost(n, x, y, z, false);
    }

    public static void main(String[] args) {
        int n = 4;
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println(solve(n, x, y, z));
    }
}
