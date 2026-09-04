// Input: 
// 15 8 15 25 9 
// Sorted Unique Values & Ranks: 
// 8 → 1 
// 9 → 2 
// 15 → 3 
// 25 → 4 
//    Output: 
// 3 1 3 4 2

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class RankTransformation {
    public static void rankTransformation(int arr[]) {

        // first only add unique number in sorted order(Tree set) in a set
        TreeSet<Integer> uniqueSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!uniqueSet.contains(arr[i])) {
                uniqueSet.add(arr[i]);

            }

        }
        System.out.println(uniqueSet);

        // then add sorted number with value in a hashset
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int value = 1;
        for (int k : uniqueSet) {
            map.put(k, value);
            value++;
        }
        System.out.println(map);

        // Step 2: Transform original array to ranks
        for (int i = 0; i < arr.length; i++) {
            System.out.print(map.get(arr[i]) + " ");
        }

        // SECOND METHOD
        // step-1:first copy original array befor sorting
        // int copyArr[] = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // copyArr[i] = arr[i];
        // }

        // sort the array
        // Arrays.sort(arr);

        // array already sorted so add key & value in hashmap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int value = 1;
        // for (int i = 0; i < arr.length; i++) {
        // if (!map.containsKey(arr[i])) {
        // map.put(arr[i], value);
        // value++;
        // }
        // }
        // System.out.println(map);

        // transform original array to rank using copyarr
        // for (int i = 0; i < copyArr.length; i++) {
        // System.out.print(map.get(copyArr[i]) + " ");
        // }
    }

    public static void main(String args[]) {
        int arr[] = { 15, 8, 15, 25, 9 };
        rankTransformation(arr);
    }
}
