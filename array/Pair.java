public class Pair {
    public static void pairs(int arr[]) {
        int TotalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")  ");
                TotalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs is" + TotalPairs);

    }

    public static void main(String args[]) {
        int numbers[] = { 52, 23, 4, 86, 41, 12 };
        pairs(numbers);
    }
}
