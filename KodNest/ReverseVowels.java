public class ReverseVowels {
    public static boolean isVowel(char ch) {
        // Check each vowel individually
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true; // ch is a vowel
        } else {
            return false; // ch is not a vowel
        }
    }

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left until vowel
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            // Move right until vowel
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // Swap the vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("geeksforgeeks")); // geeksforgeeks
        System.out.println(reverseVowels("helloworld")); // hollowerld
        System.out.println(reverseVowels("programming")); // prigrammong
    }
}
