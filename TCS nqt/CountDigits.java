// Problem: Count the number of digits in an integer. 
// Example 
// Input: 7896 
// Output: 4

public class CountDigits {
    public static void main(String[] args) {
        int num = 1234;
        int count = Integer.toString(num).length();
        // int count = String.valueOf(num).length(); also work this
        System.out.println(count);
    }
}
