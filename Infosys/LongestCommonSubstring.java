package Infosys;

public class LongestCommonSubstring {

    public static int longsetSubstring(String str1, String str2) {

        int n = str1.length();

        int pairLength = 0;
        int lastMismatch = -1;
        int left = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 == c2) {

                // Same character
                // Nothing to do

            } else if (isVowel(c1) == isVowel(c2)) {

                // Different characters,
                // but both vowels or both consonants

                if (lastMismatch != -1) {
                    // Already have one valid mismatch
                    left = lastMismatch + 1;
                }

                lastMismatch = i;

            } else {

                // Invalid mismatch
                left = i + 1;
                lastMismatch = -1;
            }

            pairLength = i - left + 1;

            maxLength = Math.max(maxLength, pairLength);
        }

        return maxLength;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

    }
}
