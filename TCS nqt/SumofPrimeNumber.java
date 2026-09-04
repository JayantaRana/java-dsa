// Problem: Given m and n, find the sum of all prime numbers between them. 
// Example 
// Input: 1 10 
// Output: 17 (2+3+5+7) 

public class SumofPrimeNumber {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {

                return false;

            }
        }
        return true;

    }

    public static void primeInRange(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");

                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("Sum is " + sum);
    }

    public static void main(String[] args) {
        System.out.println("hello");
        primeInRange(1, 20);
    }
}
