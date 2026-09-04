import java.util.Scanner;

public class SumofNnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();
        int val = 1;
        int sum = 0;
        while (val <= n) {
            sum = sum + val;
            val = val + 1;
        }
        System.out.println("Sum is  " + sum);

    }
}
