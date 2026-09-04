
public class RemoveSpace {
    public static void spaceRemove(String str) {

        // Use replaceAll to remove all whitespace
        String result = str.replaceAll("\\s+", "");

        System.out.println("Original: " + str);
        System.out.println("Without spaces: " + result);
    }

    public static void removeSpace(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String input = "g e e k";
        // spaceRemove(input);
        removeSpace(input);
    }
}
