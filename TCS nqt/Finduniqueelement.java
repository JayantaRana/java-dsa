// You are given an array containing N integers where only one element is unique (appears exactly 
// once), while all other elements appear twice. Find and return the unique element. 
// Example: 
// Input: arr = [5, 3, 2, 3, 2] 
// output :5

import java.util.HashMap;

public class Finduniqueelement {

    public static void findNUM(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
                return;
            }
        }

        System.out.println("No unique element found.");

    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 9, 9, 10, 8, 3, 2, 3, 2, 3 };
        findNUM(arr);
    }
}
