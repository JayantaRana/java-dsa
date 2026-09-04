// Problem: A perfect number is a number equal to the sum of its divisors (excluding itself). 
// Input: 28 
// Output: Yes 
// Input:9 divisors: 1,3 --> sum=1+3=4 NOT a perfect number
//  Input: 6 Divisors: 1,2,3 --->Sum= 1+2+3=6  YES perfect number

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num == sum) {
            System.out.println("Yes PerfectNumber");
        } else {
            System.out.println("NOT perfect number");
        }
    }
}
