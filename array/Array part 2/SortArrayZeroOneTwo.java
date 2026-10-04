public class SortArrayZeroOneTwo {

    // Better approach
    public static void sortArray(int arr[]) {
        int i = -1;
        int n = arr.length;

        for (int j = 0; j < n; j++) {
            if (arr[j] == 0) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int k = i + 1;

        for (int j = k; j < n; j++) {
            if (arr[j] == 1) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    // Best approach
    public static void swap(int nums[], int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void sortArrayBest(int nums[]) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        sortArrayBest(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
