public class TilingProblem {
    public static int tillingproblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int varWays = tillingproblem(n - 1);
        int horWays = tillingproblem(n - 2);
        int totalWays = varWays + horWays;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tillingproblem(3));
    }
}
