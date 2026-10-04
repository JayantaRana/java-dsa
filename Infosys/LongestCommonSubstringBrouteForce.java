package Infosys;

public class LongestCommonSubstringBrouteForce {

public static int solve(String A, String B) {
    int n = A.length();
    int m = B.length();

    int ans = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {

            int mismatch = 0;

            for (int k = 0; i + k < n && j + k < m; k++) {

                char a = A.charAt(i + k);
                char b = B.charAt(j + k);

                if (a != b) {

                    // Invalid mismatch: vowel vs consonant
                    if (isVowel(a) != isVowel(b)) {
                        break;
                    }

                    mismatch++;

                    // More than one mismatch
                    if (mismatch > 1) {
                        break;
                    }
                }

                ans = Math.max(ans, k + 1);
            }
        }
    }

    return ans;
}

static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i'
        || c == 'o' || c == 'u';
}


    public static void main(String[] args) {
        
    }
}
