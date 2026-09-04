// An intelligence agency has received secret reports containing two numbers, N and R. Your task 
// is to decode the mystery by following these steps: 
// 1. Find the sum of digits of N 
// 2. Repeat this sum R times 
// 3. Reduce the final sum to a single digit Check captions for detailed explanation 
// Special Case: If R = 0, print 0. 
// Input: N = 99 R = 3 
// Step-by-Step Calculation: 
// 1. Sum of digits of 99 → 9 + 9 = 18 
// 2. Repeat this sum R = 3 times → 18 * 3 = 54 
// 3. Reduce to a single digit: 5 + 4 = 9
// Output: 9

import java.util.Scanner;

public class MysteriousNumberChallenge {

    // Function to find sum of digits of a number
    public static int sumOfDigits(int N) {
        int sum = 0;
        while (N > 0) {
            int lastDigit = N % 10;
            sum = sum + lastDigit;
            N = N / 10;
        }
        return sum;
    }

    // Function to reduce a number to a single digit
    public static int reduceTosingleDigit(int N) {
        while (N > 9) {
            N = sumOfDigits(N);
        }
        return N;
    }

    public static void mysteriousChallenge(int N, int R) {
        int digitSum = sumOfDigits(N);
        int repeatedSum = digitSum * R;
        int result = reduceTosingleDigit(repeatedSum);
        System.out.println("Result is " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of N");
        int N = sc.nextInt();
        System.out.println("Enter value of R");
        int R = sc.nextInt();
        if (R == 0) {
            System.out.println("You enter R value as 0");
            return;
        }

        mysteriousChallenge(N, R);
    }
}
