// Problem: A string is a pangram if it contains all 26 English letters. 
// Example 
// Input: "The quick brown fox jumps over the lazy dog" 
// Output: Yes 

public class Pangram {

    public static void isPanagram(String str) {
        int index = 0;
        int flag = 1;
        boolean map[] = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            map[index] = true;
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i] == false) {
                flag = 0;
            }
        }
        if (flag == 0) {
            System.out.println("NOT pangram");
        } else {
            System.out.println("Pangram");
        }

    }

    public static void main(String[] args) {
        String str = "The quick brown Fox jumps over the lazy dog";
        isPanagram(str);
    }
}
