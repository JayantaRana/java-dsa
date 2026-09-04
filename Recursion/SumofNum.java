public class SumofNum {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        // int sumNm1 = sum(n - 1);
        // int sumN = sumNm1 + n;
        // return sumN;
        return sum(n - 1) + n;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("your sum is " + sum(n));
    }
}
