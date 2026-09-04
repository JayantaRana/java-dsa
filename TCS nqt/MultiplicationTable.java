public class MultiplicationTable {

    public static void multiplicationTable(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " X " + i + "=" + (n * i));
        }
    }

    public static void main(String[] args) {
        multiplicationTable(5);
    }
}
