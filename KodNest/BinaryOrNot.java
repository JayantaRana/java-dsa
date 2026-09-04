public class BinaryOrNot {
    public static boolean isBinary(int num) {
        // if (num <= 1) {
        // return false;
        // }
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit > 1) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }

    public static void main(String args[]) {
        int num = 0101;
        System.out.println(isBinary(num));

    }
}
