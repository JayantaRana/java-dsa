public class CountVowels {
    public static void vowelCount(String str) {
        String str2 = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' ||
                    str2.charAt(i) == 'i' || str2.charAt(i) == 'o' ||
                    str2.charAt(i) == 'u') {
                System.out.print(str.charAt(i) + " ");
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String str = "jayanteao";
        vowelCount(str);
    }
}
