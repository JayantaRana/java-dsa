import java.util.*;

public class Strings {
    public static void main(String args[]) {
        char arr[] = { 'a', 'b', 'c', 'd' };

        String str = "abcd";
        String str2 = new String("xyz");
        // Strings are IMMUTABLE
        System.out.println("Enter your name  ");
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        // String length --also count white space
        System.out.println(name.length());
    }
}
