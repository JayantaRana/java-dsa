public class DecreasingOrder {
    public static void decreasingOrder(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        decreasingOrder(n - 1);
    }

    public static void main(String args[]) {

        int n = 10;
        decreasingOrder(n);
    }
}
