
public class TypeConversion {
    public static void main(String[] args) {
        int a = 5;
        float b = 2.5f;
        System.out.println(a + b);// type conversion

        int c = 5;
        float d = 2.5f;
        int e = (int) (c + d);
        System.out.println((e));// type casting
        char ch = 'a';
        int num = ch;
        System.out.println(num);

        // Type promotion in expression
        // byte b = 5;
        // b = (byte) (b * 2); // byte -> short-> int -> float ->long- > double
        // System.out.println(b);

        // int a = 12;
        // char ch = 'a';
        // float b = 2.5f;
        // double c = 4.56;
        // double result = a + ch + b;
        // System.out.println(result);

    }
}
