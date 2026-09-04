// Problem: Reverse the digits of a given number. 
// Example 
// Input: 1234 
// Output: 4321

import java.util.Scanner;

public class ReverceNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number...");
        int num = sc.nextInt();

        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }

    }
}
