public class Question1 {
    public static boolean checkElement(int nums[]) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 5, 2, 3, 5 };
        System.out.println(checkElement(nums));
    }
}
