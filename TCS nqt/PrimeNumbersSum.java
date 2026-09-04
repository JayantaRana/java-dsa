// Given an integer N, find the sum of all prime numbers from 2 to
// Prime numbers between 2 and 10 → 2, 3,5,7.amming 
// Sum = 2+3+5+7=17

public class PrimeNumbersSum {
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sumOfPrime(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        sumOfPrime(15);
    }
}
