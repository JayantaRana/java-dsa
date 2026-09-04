import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Write your code here
        String input = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i);
            int count = input.charAt(i + 1) - '0';
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
        sc.close();
    }
}
