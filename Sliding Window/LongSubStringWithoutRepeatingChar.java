//KodNest Sliding window approach

import java.util.HashSet;

//  if (str == null || str.length() == 0) {
//         return 0;
//     }
//int[] charCount = new int[256];

// while (right < str.length()) {

//     char ch = str.charAt(right);

//     if (charCount[ch] == 0) {
//         charCount[ch]++;
//         maxLength = Math.max(maxLength, right - left + 1);
//         right++;
//     } else {
//         charCount[str.charAt(left)]--;
//         left++;
//     }
// }
public class LongSubStringWithoutRepeatingChar {

    public static int longestSubstring(String str) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = Integer.MIN_VALUE;
        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Maximum length:  " + longestSubstring(str));
    }
}

// 📍Brute force
// public class LongSubStringWithoutRepeatingChar {

// public static int longestSubstring(String str) {
// int maxLen = 0;
// for (int i = 0; i < str.length(); i++) {

// boolean visited[] = new boolean[26];
// for (int j = i; j < str.length(); j++) {

// char ch = str.charAt(j);
// if (visited[ch - 'a']) {
// break;
// }
// visited[ch - 'a'] = true;
// maxLen = Math.max(maxLen, j - i + 1);
// }
// }
// return maxLen;
// }

// public static void main(String[] args) {
// String str = "abcabcbb";
// System.out.println("Maximum length: " + longestSubstring(str));
// }
// }

// 📌Using hashset (better) bruteforce

// import java.util.HashSet;

// public class LongSubStringWithoutRepeatingChar {

// public static int longestSubstring(String str) {
// int maxLen = 0;
// for (int i = 0; i < str.length(); i++) {

// HashSet<Character> set = new HashSet<>();
// for (int j = i; j < str.length(); j++) {

// char ch = str.charAt(j);
// if (set.contains(ch)) {
// break;
// }
// set.add(ch);
// maxLen = Math.max(maxLen, j - i + 1);
// }
// }
// return maxLen;
// }

// public static void main(String[] args) {
// String str = "abcabcbb";
// System.out.println("Maximum length: " + longestSubstring(str));
// }
// }