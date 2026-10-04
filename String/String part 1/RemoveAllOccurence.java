public class RemoveAllOccurence {
    public static String remove(String s, String part) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.indexOf(part) != -1) {
            int index = sb.indexOf(part);
            sb.delete(index, index + part.length());
        }

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
