public class Operators {
    public static void main(String[] args) {
        int a = 25;
        int b = 5;
        // System.out.println("Sum is " + (a + b));

        // System.out.println("Subtraction is " + (a - b));
        // System.out.println("Multiplication is " + (a * b));

        // System.out.println("Division is " + (a / b));
        // System.out.println("Remainder is " + (a % b));

        int c = a++;// post increment
        System.out.println(c);
        System.out.println(a);

        System.out.println((a > b) || (b == a));
        System.out.println(a > b);
        b += 2;
        System.out.println(b);

    }
}
