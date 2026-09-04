public class Practice {

    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            for (int i = 2; i < num; i++) {
                if (num % i != 0) {
                    System.out.println(num);
                }
            }
        }

    }
}