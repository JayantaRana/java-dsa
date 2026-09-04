// Problem: Given an array of N-1 numbers containing integers from 1 to N with one number 
// missing, find the missing number. 
// Example: 
// Input: [1, 2, 4, 5, 6]   
// Output: 3 

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        int sum = n * (n + 1) / 2; // Sum of first n numbers
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            sum -= arr[i];
        }
        sc.close();
        System.out.println("answer " + sum);
    }
}
