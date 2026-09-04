
// Given an array of integers, find the first non-repeating element. 
//OR find first unique number
// Example: 
// Input: [4, 5, 1, 2, 0, 4, 1, 2] 
// Output: 5 
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonReapiting {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        int arr[] = { 4, 5, 1, 2, 0, 4, 1, 2 };
        for (int i = 0; i < arr.length; i++) {
            if (lhm.containsKey(arr[i])) {
                lhm.put(arr[i], lhm.get(arr[i]) + 1);
            } else {
                lhm.put(arr[i], 1);
            }
        }
        System.out.println(lhm);
        Set<Integer> map = lhm.keySet();
        for (Integer key : map) {
            if (lhm.get(key) == 1) {
                System.out.println(key);
                return;
            }
        }
    }
}
