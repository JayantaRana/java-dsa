//Moor'es voting
public class MajorityElement {
    public static int majorityElement(int arr[]) {
        int n = arr.length;
        int freq = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (freq == 0) {
                ans = arr[i];
            }
            if (ans == arr[i]) {
                freq++;
            } else {
                freq--;

            }
        }
        // if given ans may exist or not
        int count = 0;
        for (int num : arr) {
            if (num == ans) {
                count++;
            }
        }

        if (count > n / 2) {
            return ans;
        } else {
            return -1;
        }
        // return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 2, 2, 2, 1, };
        System.out.println(majorityElement(arr));
    }
}