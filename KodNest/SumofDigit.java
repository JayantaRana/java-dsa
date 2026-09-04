public class SumofDigit {
    public static void main(String args[]) {
        int num[][] = { { 4, 5, 3, 2 }, { 9, 5, 6, 2 }, { 1, 5, 3, 5 } };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum = sum + num[i][j];
            }
        }
        System.out.println(sum);
    }
}
