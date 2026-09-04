// int arr[] = {10, 5, 20, 15};
// max1=20,max2=15,max3=10 
public class LargestThreeNumber {
    public static void findTopThree(int arr[]) {
        if (arr.length < 3) {
            System.out.println("Need at least three element...");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }
        System.out.println("First max  " + max1);
        System.out.println("Second max " + max2);
        System.out.println("Third max   " + max3);
    }

    public static void main(String args[]) {
        int arr[] = { 10, 15, 20, 5 };
        findTopThree(arr);
    }
}
