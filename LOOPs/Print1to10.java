import java.util.Scanner;

public class Print1to10 {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

    }
}
