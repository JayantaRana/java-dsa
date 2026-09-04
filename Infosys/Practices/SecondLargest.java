public class SecondLargest {
    public static void secondLargest(int arr[]) {

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // find second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }

    public static void secondLargestApproach2(int arr[]) {
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2 };
        secondLargestApproach2(arr);
    }
}