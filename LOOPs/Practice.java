import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // for (int i = 2; num - 1 >= i; i++) {
        // if (num % i == 0) {
        // isPrime = false;

        // }
        // }

        // if (isPrime == true) {
        // System.out.println("Prime number");
        // } else {
        // System.out.println("Not a Pfrime number");
        // }
        // }

        // print reverse 10899 ----> 99801
        int num = 10899;
        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }
    }
}