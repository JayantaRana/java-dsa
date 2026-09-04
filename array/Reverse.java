public class Reverse {
    public static void reverse(int arr[]) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            // swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;

        }
    }

    public static void main(String[] args) {
        int numbers[] = { 52, 36, 12, 47, 56, 98 };

        for (int i = 0; i < numbers.length; i++) { // if you want to first print first array
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}