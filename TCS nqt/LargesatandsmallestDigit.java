// Input: 57392 
// Output: Largest: 9, Smallest: 2

public class LargesatandsmallestDigit {
    public static void main(String[] args) {
        int num = 57392;
        int maxDigit = 0;
        int minDigit = 9;
        while (num > 0) {
            int lastDigit = num % 10;
            maxDigit = Math.max(maxDigit, lastDigit);
            minDigit = Math.min(minDigit, lastDigit);
            num = num / 10;
        }

        System.out.println("Max Digit " + maxDigit);
        System.out.println("Min Digit " + minDigit);
    }
}
