import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income ");
        int income = sc.nextInt();
        int tax;

        if (income < 50000) {
            tax = 0;
        } else if (income >= 50000 && income < 100000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is " + tax);
        System.out.println(200000 * 0.3);

    }
}
