public class ArrayBacktracking {
    public static void arrayBacktracking(int arr[], int val, int i) {
        // Base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        arr[i] = val;
        arrayBacktracking(arr, val + 1, i + 1);// recursion
        arr[i] = arr[i] - 2;// backtracking step
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        arrayBacktracking(arr, 1, 0);
        printArr(arr);

    }
}
