
//IMPORTANT:Product of given two numbers  = GCD*LCM 
//Example :a=36,b=20 then 20*36=720 and LCM(20,36)*GCD(20,36)=720

public class LCM {
    public static void findLCM(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
    }

    public static void main(String[] args) {
        findLCM(5, 15);

    }
}
