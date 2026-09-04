// Problem: Find the sum of even and odd numbers separately. 
// Example 
// Input: {1, 2, 3, 4, 5} 
// Output: Even Sum: 6, Odd Sum: 9

public class SumAllEvenandOddNUmbers {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
        }
        System.out.println("Evene sum " + evenSum);
        System.out.println("Odd sum " + oddSum);
    }
}
