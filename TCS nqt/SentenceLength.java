public class SentenceLength {
    public static void main(String args[]) {
        String str = "i am jayanta rana";
        char arr[] = str.toCharArray();
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            len++;
        }
        System.out.println(len);

    }
}
