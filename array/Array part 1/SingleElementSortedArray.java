public class SingleElementSortedArray {
    public static int singleElement(int nums[]) {
        int start = 0;
        int end = nums.length - 1;

        // check edge case means check single at start and end
        // check outside loop or inside loop
        if (nums[start] != nums[start + 1])
            return nums[start];
        if (nums[end] != nums[end - 1])
            return nums[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // check edge case means check single at start and end
            // if (mid == 0 && nums[mid] != nums[mid + 1])
            // return nums[mid];
            // if (mid == nums.length - 1 && nums[mid - 1] != nums[mid])
            // return nums[mid];

            // check if mid is single
            if (nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid])
                return nums[mid];
            if (mid % 2 == 0) {
                if (nums[mid - 1] == nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid - 1] == nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int arr[] = { 3, 3, 7, 7, 10, 11, 11 };
        // int arr[] = { 1, 2, 2, 3, 3 };
        System.out.println(singleElement(arr));
    }
}
