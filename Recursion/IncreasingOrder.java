public class IncreasingOrder {
    public static void increasingOrder(int num) {
        if (num == 1) {
            System.out.print(1 + " ");
            return;
        }

        increasingOrder(num - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        increasingOrder(10);
    }
}
