import java.util.Scanner;

public class StringUncompresed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String .. ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        // Character.getNUmericValue(), isDigit, isLetter
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                for (int j = 1; j < count; j++) {
                    sb.append(str.charAt(i - 1));
                }
            } else {
                sb.append(ch);
            }
        }

        System.out.println("String; " + sb.toString());
    }
}
