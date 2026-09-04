package Infosys;

public class MinimumOperationstoReduceNto1Resursion {
    public static int minimumOper(int n, int x, int y, int z, boolean isDivide) {
        if (n == 1) {
            return 0;
        }
        if (isDivide) {
            return x + minimumOper(n - 1, x, y, z, false);
        }

        // substract
        int mincost = x + minimumOper(n - 1, x, y, z, false);

        // divide /2
        if (n % 2 == 0) {
            int cost = y + minimumOper(n / 2, x, y, z, true);
            mincost = Math.min(mincost, cost);
        }
        if (n % 3 == 0) {
            int cost = z + minimumOper(n / 3, x, y, z, true);
            mincost = Math.min(mincost, cost);
        }

        return mincost;

    }

    public static void main(String[] args) {
        System.out.println(minimumOper(10, 1, 2, 3, false));
    }
}
