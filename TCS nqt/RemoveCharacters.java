import java.util.HashMap;
// Remove Characters 
// Given two strings A and B, remove all characters in A that are present in B and print the 
// resulting string C. 
// Example: 
// Input: 
// A = "Tiger" 
// B = "Ti" 

public class RemoveCharacters {
    public static void removeCharacter(String str1, String str2) {
        StringBuilder sb = new StringBuilder("");
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str2.length(); i++) {
            map.put(str2.charAt(i), 1);
        }

        // for (int i = 0; i < str1.length(); i++) {
        // if (map.get(str1.charAt(i)) == null) {
        // sb.append(str1.charAt(i));
        // }
        // }

        // OR

        for (int i = 0; i < str1.length(); i++) {
            if (!map.containsKey(str1.charAt(i))) {
                sb.append(str1.charAt(i));
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str1 = "Tigier";
        String str2 = "Tig";
        removeCharacter(str1, str2);
    }
}