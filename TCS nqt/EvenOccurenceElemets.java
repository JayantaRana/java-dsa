// Given an array of integers where some elements are repeated multiple times, find and print all 
// elements that appear an even number of times in the array. If no element is repeated an even 
// number of times, print -1. 
// Input: arr=[1,2,3,2,3,3,4,4,4,4]
// output:2 4

import java.util.ArrayList;
import java.util.HashMap;

public class EvenOccurenceElemets {
    public static void findEvenOccurence(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer k : map.keySet()) {
            if (map.get(k) % 2 == 0) {
                result.add(k);
            }
        }

        if (result.isEmpty()) {
            System.out.println("result  -1");
        } else {
            for (int num : result) {
                System.out.println(num + " ");
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 2, 3, 4, 3, 4, 4, 4 };
        findEvenOccurence(arr);
    }

}
