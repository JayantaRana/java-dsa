public class ArrayPalindrom {
    public static boolean palindrom(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= arr.length / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 0, 6, 4 };

        if (palindrom(arr)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }
    }
}
