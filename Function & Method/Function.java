import java.util.Scanner;

public class Function {
    public static void calculate() {

        // int sum = a + b;
        // System.out.println("Your result" + sum);

        System.out.println("Enter  first number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter  second number ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Your result  " + sum);

    }

    public static void main(String args[]) {
        // System.out.println("Enter first number ");
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println("Enter second number ");
        // int b = sc.nextInt();
        // calculate(a, b);
        calculate();
    }
}
