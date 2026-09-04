import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number ");
        int a = sc.nextInt();

        System.out.println("enter your Second number ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Your sum is " + sum);
    }
}
