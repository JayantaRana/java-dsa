//Input:342
//Output:24(3*4*2);

public class MultiplicationofNumbers {
    public static void main(String[] args) {
        int mul = 1;
        int num = 342;
        while (num > 0) {
            int lastDigit = num % 10;
            mul = mul * lastDigit;
            num = num / 10;
        }
        System.out.println("Multification of number " + mul);
    }
}
