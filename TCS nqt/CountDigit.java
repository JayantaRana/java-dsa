// count the digit 
// input:123
// output: 3

public class CountDigit {
    public static void main(String[] args) {
        int num = 123;
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println("count is  " + count);
    }
}
