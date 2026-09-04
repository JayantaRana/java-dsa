// Input: "helloa" 
// Output: Vowels: 2, Consonants: 3
public class VowelConsonent {
    public static void vowelConsonent(String str) {
        int countVowel = 0;
        int countConsonent = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                countVowel++;
            } else {
                countConsonent++;
            }
        }
        System.out.println("Vowels " + countVowel);
        System.out.println("Consonents " + countConsonent);
    }

    public static void main(String args[]) {
        String str = "helloa";
        vowelConsonent(str);
    }
}
