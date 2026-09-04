public class PowerofX {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return (x * pow(x, n - 1));
    }

    // optimized code
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = power(x, n / 2);
        int result = halfPower * halfPower;
        if (n % 2 != 0) { // this handle odd case
            result = result * x;
        }
        return result;
    }

    // work for both positive and negative power

    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        if (N == 0) {
            return 1;
        }
        double halfPower = myPow(x, (int) (N / 2));
        double result = halfPower * halfPower;

        if (N % 2 != 0) { // od case
            result = result * x;

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(pow(5, 3));
        System.out.println(power(2, 5));

    }
}
