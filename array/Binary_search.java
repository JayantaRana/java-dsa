package array;

public class Binary_search {
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 52, 12, 63, 78, 95, 45 };
        int key = 45;
        System.out.println("key found in index number is " + binarySearch(arr, key));
    }
}
