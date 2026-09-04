
public class Swap {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=  " + a);
        System.out.println("b=  " + b);

    }

    public static void main(String[] args) {
        int x = 12;
        int y = 45;
        swap(x, y);
    }
}
