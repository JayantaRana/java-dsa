
public class SwapTwoNumber {
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a= " + a + "b=  " + b);
    }

    public static void usinXOR(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10
    }

    public static void main(String args[]) {
        int a = 10, b = 20;
        swap(a, b);
    }
}
