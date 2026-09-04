public class SecondLargestElement {
    public static void largestelement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        System.out.println("hello");
        largestelement(arr);
    }
}
