// Problem: Given a number N, count the number of 1s in its binary representation. 
// Example: 
// Input: 7   
// Binary: 111   
// Output: 3

public class Count1inBinary {
    public static void convertBinary(int num) {
        int bin = 0;
        int pow = 0;
        while (num > 0) {
            int rem = num % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;

        }
        System.out.println(bin);
        int count = 0;
        while (bin > 0) {
            int lastDigit = bin % 10;
            if (lastDigit == 1) {
                count++;

            }
            bin = bin / 10;
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        convertBinary(9);

    }
}
