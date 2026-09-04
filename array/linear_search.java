public class linear_search {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; // if not match key return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 525, 63, 48, 75, 12 };
        int key = 20;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(key + " found in index number " + index);
        }
    }
}
