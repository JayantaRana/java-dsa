public class Prime {

    public static void checkPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= (n - 2); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;

            }

        }
        if (isPrime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("not prime");
        }

    }

    public static void main(String[] args) {
        checkPrime(10);
        checkPrime(15);
        checkPrime(2);

    }
}
