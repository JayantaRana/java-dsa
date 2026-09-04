// Given a number N, check if it is a Kaprekar Number (a number whose square, when split into 
// two parts, sums up to the number itself). 
// Input: 45 
// Output: Yes 
// Explanation: 45² = 2025 → 20 + 25 =45

public class KaprekarNumber {
    public static boolean isKaprekar(int n) {
        if (n == 1) { // 1 is a kaprekar number
            return true;
        }
        int square = n * n;
        String strSquare = Integer.toString(square);
        int lenght = strSquare.length();
        for (int i = 1; i < lenght; i++) {
            String leftpart = strSquare.substring(0, i);
            String rightpart = strSquare.substring(i);

            int leftNum = leftpart.isEmpty() ? 0 : Integer.parseInt(leftpart);
            int rightNum = rightpart.isEmpty() ? 0 : Integer.parseInt(rightpart);

            if (leftNum + rightNum == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 45;

        if (isKaprekar(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
