import java.util.Scanner;

public class StringConcatenation {
    public static void main(String args[]) {
        // String firstName = "Jayanta";
        // String lastName = "Rana";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        System.out.println("Enter your first name");
        Scanner sc = new Scanner(System.in);
        String firstName;
        firstName = sc.next();

        System.out.println("Enter your last name");
        String lastName;
        lastName = sc.next();

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());// string length
        System.out.println(fullName.charAt(0)); // find index char

    }
}
