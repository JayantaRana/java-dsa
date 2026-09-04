public class FindSubset {
    public static void findsubsets(String str, int i, String ans) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Yes choice
        findsubsets(str, i + 1, ans + str.charAt(i));
        // No choice
        findsubsets(str, i + 1, ans);
    }

    public static void main(String args[]) {
        String str = "abc";
        findsubsets(str, 0, "");
    }
}
