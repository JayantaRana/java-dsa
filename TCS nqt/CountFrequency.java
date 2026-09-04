// Input: "hello" 
// Output: 
// h: 1   
// e: 1   
// l: 2   
// o: 1   

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountFrequency {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        String str = "hello";
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);

            } else {
                map.put(str.charAt(i), 1);

            }
        }

        // for (int i = 0; i < str.length(); i++) {
        // map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        // }

        for (char ch : map.keySet()) {
            System.out.println(ch + ":" + map.get(ch));
        }
    }
}
