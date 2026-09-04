import java.util.Arrays;

public class FindMInimumelement {
    public static void minimumTwo(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Enter more than two numbers");
            return;
        }

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
    }

    // for repeatative number
    public static void minimumTwo2(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Enter more than two numbers");
            return;
        }

        // Sort the array first
        Arrays.sort(arr);

        int min1 = arr[0];
        int min2 = Integer.MAX_VALUE;
        boolean foundSecond = false;

        // Look for next distinct element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != min1) {
                min2 = arr[i];
                foundSecond = true;
                break;
            }
        }

        if (foundSecond) {
            System.out.println("First min: " + min1);
            System.out.println("Second min (distinct): " + min2);
        } else {
            System.out.println("Only one distinct element exists: " + min1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 20, 2, 10 };
        minimumTwo(arr);
    }
}
// First min -1
// Second min 2
