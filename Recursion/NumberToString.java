public class NumberToString {
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigits(int n) {
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        printDigits(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {

        printDigits(1947);
    }
}
