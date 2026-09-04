// Given an array N representing chocolate packets, where 0 indicates an empty packet, move all 
// O's to the end while maintaining the order of non-zero elements. 

// Input: arr = [4, 5, 0, 1, 9, 0,5, 0] 
// Output: 45195000

public class ChocolatePackets {
    public static void moveZerosToEnd(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // for (int num : arr) {
        // System.out.print(num + " ");
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 0, 1, 9, 0, 5, 0 };
        moveZerosToEnd(arr);
    }
}
