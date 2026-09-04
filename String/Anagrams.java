import java.util.Arrays;

public class Anagrams {

    public static void checkAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {

            // convert string into char array
            char str1array[] = str1.toCharArray();
            char str2array[] = str2.toCharArray();

            // sort the char array
            Arrays.sort(str1array);
            Arrays.sort(str2array);

            boolean result = Arrays.equals(str1array, str2array);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are  anagrams of each other");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }

        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
    }

    public static void main(String args[]) {
        String str1 = "race";
        String str2 = "norc";
        checkAnagram(str1, str2);
    }
}
