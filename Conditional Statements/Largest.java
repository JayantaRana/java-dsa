public class Largest {
    public static void main(String[] args) {
        int a = 125;
        int b = 45;
        int c = 2145;
        // if (a > b && a > c) {
        // System.out.println("largest number is " + a);
        // } else if (b > a && b > c) {
        // System.out.println("largest number is " + b);
        // } else {
        // System.out.println("largest number is " + c);
        // }
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
