import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number  ");
        int a = sc.nextInt();

        System.out.println("Enter second number  ");
        int b = sc.nextInt();

        System.out.println("Select operation ");
        char operation = sc.next().charAt(0);

        switch ((operation)) {
            case '+':
                System.out.println("Your result is " + (a + b));

                break;
            case '-':
                System.out.println("Your result is " + (a - b));

                break;
            case '*':
                System.out.println("Your result is " + (a * b));
                break;
            case '/':
                System.out.println("Your result is " + (a / b));
                break;

            default:
                System.out.println("Wrong choice");
        }
    }
}
