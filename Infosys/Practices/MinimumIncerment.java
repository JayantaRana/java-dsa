package Infosys.Practices;

public class MinimumIncerment {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 7 };
        int cost = 0;

        for (int i = 1; i < arr.length; i++) {
            int prev = arr[i - 1];
            int curr = arr[i];
            int div = i + 1;
            while (curr < prev || curr % div != 0) {
                curr++;
                cost++;
            }

            arr[i] = curr;
        }

        System.out.println(cost);
    }
}
