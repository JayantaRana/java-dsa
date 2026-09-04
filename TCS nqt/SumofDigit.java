// Problem: Given a number, find the sum of its digits. 
// Example 
// Input: 1234 
// Output: 10 (1+2+3+4 = 10)

import java.util.Scanner;

public class SumofDigit {
    public static void sum(int num) {
        int sum = 0;
        while (num > 0) {

            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        System.out.println("sum is  " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number...");
        int num = sc.nextInt();
        sum(num);

    }
}
