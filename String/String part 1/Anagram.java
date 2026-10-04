import java.util.HashMap;

public class Anagram {

    // tc: O(n) sc:O(n)
    public static boolean anagramBetter(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            m1.put(ch, m1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            m2.put(ch, m2.getOrDefault(ch, 0) + 1);
        }

        return m1.equals(m2);
    }

    // tc:o(n) sc:O(1)
    public static boolean anagramBest(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int count[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "jaav";
        System.out.println(anagramBetter(s1, s2));
    }
}
