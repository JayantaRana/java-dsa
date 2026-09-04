// Problem: Compute GCD using the Euclidean algorithm. 
// Example 
// Input: 12 15 
// Output: 3

import java.util.Scanner;

public class GCD {
    public static void findGCD(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    public static void main(String[] args) {

        findGCD(20, 36);
    }
}
