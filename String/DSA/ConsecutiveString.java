import java.util.Arrays;//problrm

public class ConsecutiveString {

    public static void removeDuplicates(char str[]) {
        int n = str.length;

        // for empty or sibglr character string
        if (n < 2) {
            return;
        }

        int j = 0;
        for (int i = 1; i < n; i++) {
            if (str[j] != str[i]) {
                j++;
                str[j] = str[i];
            }
        }
        System.out.println(Arrays.copyOfRange(str, 0, j + 1));
    }

    public static void main(String args[]) {
        char name[] = "hellofhf".toCharArray();
        removeDuplicates(name);

    }
}
