public class Vowels {
    // print only vowels letters
    public static void vowelLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ('a' == str.charAt(i) || 'e' == str.charAt(i) || 'i' == str.charAt(i) || 'o' == str.charAt(i)
                    || 'u' == str.charAt(i) || 'A' == str.charAt(i) || 'E' == str.charAt(i) || 'I' == str.charAt(i)
                    || 'O' == str.charAt(i)
                    || 'U' == str.charAt(i)) {
                System.out.print(str.charAt(i) + " ");
            }

        }
    }

    // count number of vowels and consonants
    public static void Countvowel(String str2) {
        // convertibg string to a lower case for reduce comparisons
        String str = str2.toLowerCase();
        int vCount = 0, cCount = 0;
        for (int i = 0; i < str2.length(); i++) {
            if ('a' == str.charAt(i) || 'e' == str.charAt(i) || 'i' == str.charAt(i) || 'o' == str.charAt(i)
                    || 'u' == str.charAt(i)) {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {// important because count also whitespace
                cCount++;
            }

        }
        System.out.println(vCount);
        System.out.println(cCount);

    }

    // print only consonents letters
    public static void ConsonentLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ('a' == str.charAt(i) || 'e' == str.charAt(i) || 'i' == str.charAt(i) || 'o' == str.charAt(i)
                    || 'u' == str.charAt(i) || 'A' == str.charAt(i) || 'E' == str.charAt(i) || 'I' == str.charAt(i)
                    || 'O' == str.charAt(i)
                    || 'U' == str.charAt(i)) {

            } else {
                System.out.print(str.charAt(i) + " ");
            }

        }

    }

    public static void main(String args[]) {
        String str = "jayanta rana";// jayanta rana
        vowelLetters(str);
        // ConsonentLetters(str);
        // Countvowel(str);

    }
}
