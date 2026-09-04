//KodNest

import java.util.ArrayList;
import java.util.List;

public class FindkClosestElements {
    public static List<Integer> closestElements(int arr[], int k, int x) {

        int left = 0;
        int right = arr.length - 1;
        while ((right - left + 1) > k) {

            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            } else {
                right--;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 8, 10, 15 };
        int k = 3;
        int x = 5;

        System.out.println("Result: " + closestElements(arr, k, x));
    }
}
