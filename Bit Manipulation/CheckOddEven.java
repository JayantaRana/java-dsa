public class CheckOddEven {
    public static void EvenOdd(int n) {
        int Bitmask = 1;
        if ((n & Bitmask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String args[]) {
        EvenOdd(3);
        EvenOdd(12);
    }
}
