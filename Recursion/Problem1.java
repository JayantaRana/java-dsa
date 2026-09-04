import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Problem1 {
    // print n to 1
    public static void print(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        print(n - 1);
    }

    public static void incPrint(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        incPrint(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
        incPrint(5);

    }
}
