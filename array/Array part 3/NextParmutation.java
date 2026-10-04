import java.util.Arrays;

public class NextParmutation {

    public static void reverse(int arr[], int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void nextPermutation(int arr[]) {

        // find pivot
        int pivot = -1, n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // step - 2: next larger element
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        // step - 3: reverse pivot + 1 to n - 1
        int i = pivot + 1, j = n - 1;
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 5, 4 };
        System.out.println("Hello");
        nextPermutation(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
