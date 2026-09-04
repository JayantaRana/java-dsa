public class StringDecompression {

    public static String decompress(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Reads the whole number, for example 2, 10, or 123.
            while (i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                i++;
                count = count * 10 + (str.charAt(i) - '0');
            }

            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(decompress("s2p3"));  // ssppp
        System.out.println(decompress("f10"));   // ffffffffff
        System.out.println(decompress("a12b3")); // aaaaaaaaaaaabbb
    }
}
