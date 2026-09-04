// Given a string s and an integer k, find the length of the longest contiguous substring that 
// contains at most k distinct characters.
// Input: 
// s = "eceba"   
// k = 2   
// Output: 
// 3   
// 1. "e" → valid 
// 2. "ec" → valid 
// 3. "ece" → valid (Max Length = 3)
// 4. "eceb" → invalid (3 distinct characters) → remove 'e' 
// 5. "ceb" → valid (Max Length remains 3) 
// 6. "ba" → valid but length = 2, so we keep max as 3.

import java.util.HashMap;

public class SlidingWindow {
    public static int longestSubString(String str, int k) {
        if (str == null || str.length() == 0 || k == 0) {
            return 0;
        }

        int start = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < str.length(); end++) {
            char ch = str.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char startChar = str.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "eceba";
        int k = 2;
        System.out.println(longestSubString(str, k));
    }
}
