// Given a list of words, write a function to group them into sets of anagrams. 
// Inputs: ['cat', 'dog', 'god', 'tac', 'act', 'odg'] 
// Output: [{'cat', 'tac', 'act'}, {'dog', 'god', 'odg'}] 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void groupAnagram(String words[]) {

        // Step 1: Add all words with value 1 (unprinted)
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : words) {
            map.put(str, 1);
        }

        // Step 2: Loop through each word
        for (String str : words) {
            if (map.get(str) == 1) {

                ArrayList<String> group = new ArrayList<>();

                group.add(str);
                map.put(str, 0);

                // Step 3: Check with all other words

                for (String other : words) {
                    if (!str.equals(other) && map.get(other) == 1 && isAnagram(str, other)) {
                        group.add(other);
                        map.put(other, 0);
                    }
                }

                System.out.println(group);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "cat", "dog", "god", "tac", "act", "odg", "kl", "cat" };
        groupAnagram(words);
    }
}