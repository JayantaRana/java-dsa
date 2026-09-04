public class SubArray {
    public static void PrintSubArray(int arr[]) {
        int ts = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) { // print
                    System.out.print(arr[k] + " "); // subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total subarray  " + ts);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        PrintSubArray(arr);
    }
}
