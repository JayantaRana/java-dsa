/*Given a range [m, n] (both inclusive) where 0 ≤ m, n ≤ 10000, find the sum of all integers 
between m and n. 
Example:  
Input: 0 3 
Output: 6 
Explanation: 0+1+2+3 =6*/

import java.util.Scanner;

public class SumInRange {
    public static int sumInRange(int m, int n) {
        if (m < 0 || n > 10000 || m > n) {
            throw new IllegalArgumentException("Invalid input: Ensure 0 ≤ m ≤ n ≤ 10000");
        }
        return (n * (n + 1) / 2) - (m * (m - 1) / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        try {
            System.out.println(sumInRange(m, n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
