public class TrappingRainWater {
    public static int rainWater(int arr[]) {
        int n = arr.length;
        int trappedWater = 0;

        if (n == 0 || n == 2) {
            return 0;
        }

        int left[] = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > left[i - 1]) {
                left[i] = arr[i];
            } else {
                left[i] = left[i - 1];
            }
        }

        int right[] = new int[n];
        right[right.length - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > right[i + 1]) {
                right[i] = arr[i];
            } else {
                right[i] = right[i + 1];
            }
        }

        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(left[i], right[i]);
            trappedWater += waterlevel - arr[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(rainWater(arr));

    }
}
