import java.util.*;

class largest {
    public static int Largevalue(int arr[]) {
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }

            if (small > arr[i]) {
                small = arr[i];
            }
        }
        System.out.println("smallest number is " + small);

        return large;
    }

    public static void main(String args[]) {
        int arr[] = { 52, 36, 112, 12, 47, 58, 90 };
        System.out.println("largest number is " + Largevalue(arr));
    }
}
