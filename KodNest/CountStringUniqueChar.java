import java.util.HashSet;

public class CountStringUniqueChar {
    public static void main(String args[]) {
        String str = "geeksforgeeks";
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        System.out.println(set.size());
    }
}
