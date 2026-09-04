// Problem: Check if a number is an Armstrong number. 
// Example 
// Input: 153--->(1*1*1)+(5*5*5)+(3*3*3)=153
// Output: Yes
// Input:1253 --->(1*1*1*1)+(2*2*2*2)+(5*5*5*5)+(3*3*3*3)=723 No

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int length = Integer.toString(num).length();
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + (int) Math.pow(lastDigit, length);

            num = num / 10;

        }
        if (original == sum) {
            System.out.println("YES Armstrong");
        } else {
            System.out.println("NOT Armstrong");
        }

    }
}
