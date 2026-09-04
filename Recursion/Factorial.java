
public class Factorial {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int factNm1 = fact(n - 1);
        int factN = factNm1 * n;
        return factN;
    }

    public static void main(String args[]) {
        int n = 5;
        // System.out.println(fact(5));
        System.out.println(fact(n));
    }
}
