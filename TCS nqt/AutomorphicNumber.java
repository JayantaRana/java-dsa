// Problem: A number is automorphic if its square ends with the same number. 
// Example 
// Input: 25 
// Output: Yes (25^2 = 625)

public class AutomorphicNumber {

    public static boolean isAutomorphic(int num) {

        int square = num * num;
        System.out.println(square);
        while (num > 0) {
            int NumLastDigit = num % 10;
            int squareLastDigit = square % 10;
            if (NumLastDigit != squareLastDigit) {
                return false;

            }
            num = num / 10;
            square = square / 10;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAutomorphic(16) ? "Automorphic" : " NOT automorphic");

    }
}
