import java.util.Scanner;

public class Practice {

    public static int binaryTodecimal(int num) {
        int decimal = 0;
        int pow = 0;
        while (num > 0) {
            int lastDigit = num % 2;
            decimal = decimal + (lastDigit * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        return decimal;

    }

    public static void main(String[] args) {
        System.out.println("result " + binaryTodecimal(13));

    }
}
