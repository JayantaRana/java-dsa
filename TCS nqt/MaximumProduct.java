// Find the Maximum Product of Two Distinct Elements in an Array 
// Input:[1, 4, 3, 6, 7, 0] 
// Output: 42

import java.util.Arrays;

public class MaximumProduct {

    // another method
    public static void maxProduct(int arr[]) {
        if (arr.length < 2) {
            System.out.println("enter more then one elemnt");
        }
        int max1 = Integer.MIN_VALUE;// first largest
        int max2 = Integer.MIN_VALUE;// second largest
        for (int num : arr) {
            if (num > max1) {

                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        System.out.println("first max " + max1);
        System.out.println("second max " + max2);

        // now if array given this format arr[] ={-2,-30,2,4,5}
        // then this logic will not work so...
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        System.out.println("First min " + min1);
        System.out.println("Second min  " + min2);
        int product1 = max1 * max2;
        int product2 = min1 * min2;
        System.out.println("max product is  " + Math.max(product1, product2));

    }

    public static void main(String[] args) {
        int arr[] = { -2, -40, 3, 6, 2, 0 };
        // Arrays.sort(arr);
        // int maxProduct = arr[arr.length - 1] * arr[arr.length - 2];
        // System.out.println(maxProduct);
        maxProduct(arr);

    }

}
