// Input: "programming" 
// Output: "progamin"
public class RemoveDuplicate {
    public static void removeDuplicate(String str, int idx, boolean map[], StringBuilder newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
        }
        if (map[str.charAt(idx) - 'a'] == true) {
            removeDuplicate(str, idx + 1, map, newStr);
        } else {
            map[str.charAt(idx) - 'a'] = true;
            removeDuplicate(str, idx + 1, map, newStr.append(str.charAt(idx)));
        }
    }

    public static void main(String args[]) {
        String str = "programming";
        removeDuplicate(str, 0, new boolean[30], new StringBuilder(""));
    }
}
