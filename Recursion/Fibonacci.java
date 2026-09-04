public class Fibonacci {
    public static int fibNum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibNum(n - 1) + fibNum(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibNum(5));
    }
}
