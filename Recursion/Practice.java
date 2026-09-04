public class Practice {

    public static int practice(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        return practice(n - 1) + (n - 1) * practice(n - 2);

    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        System.out.println(practice(3));

    }
}