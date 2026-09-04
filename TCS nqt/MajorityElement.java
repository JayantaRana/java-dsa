// Given an array nums of size n, return the majority element,
//  which appears more than ⌊n/3⌋ times.

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = { 2, 2, 1, 0, 1, 2, 2, 2, 2 };
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (Integer k : hm.keySet()) {
            if (hm.get(k) > arr.length / 3) {
                System.out.println(k);
            }
        }

    }
}
