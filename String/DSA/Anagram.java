//An anagram of a string is another string that contains the same characters ,
// only the order of characters can be different. example,"abcd" and "dabc" are an anagram of each other.
//time complexityO(N * logN)
//sorting method
// import java.util.*;

// public class Anagram {

//     public static boolean areAnagram(String a, String b) {
//         // check string length are same are not

//         int n1 = a.length();
//         int n2 = b.length();
//         if (n1 != n2)
//             return false;

//         // sort both string
//         Arrays.sort(str1);
//         Arrays.sort(str2);

//         // compare sorted strings
//         for (int i = 0; i < n1; i++)
//             if (str1[i] != str2[i])
//                 return false;
//         return true;

//     }

//     public static void main(String args[]) {
//         String a = "gram";
//         String b = "agr";
//         // function call
//         if (areAnagram(a, b))
//             System.out.println("The two strings are anagram of each other");
//         else
//             System.out.println("The two strings are not anagram of each other");

//     }

// }

//method 2
import java.util.*;

public class Anagram {
    static boolean isAnagram(String str1, String str2) {
        // sort the characters in both strings
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        // compare the sorted strings
        return Arrays.equals(a, b);
    }

    public static void main(String args[]) {
        String str1 = "gram";
        String str2 = "rmga";
        if (isAnagram(str1, str2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
    }

}

// for characters
// An anagram of a string is another string that contains the same characters ,
// only the order of characters can be different. example,"abcd" and "dabc" are
// an anagram of each other.
// time complexityO(N * logN)
// sorting method
// import java.util.*;

// public class Anagram {

// public static boolean areAnagram(char str1[], char str2[]) {
// // check string length are same are not

// int n1 = str1.length;
// int n2 = str2.length;
// if (n1 != n2)
// return false;

// convert string to array
// char str1[] = a.toCharArray();
// char str2[] = b.toCharArray();

// // sort both string
// Arrays.sort(str1);
// Arrays.sort(str2);

// // compare sorted strings
// for (int i = 0; i < n1; i++)
// if (str1[i] != str2[i])
// return false;
// return true;

// }

// public static void main(String args[]) {
// char str1 = {'g', 'r','m', 'a'};
// char str2 = {'a','g','r','m'};
// // function call
// if (areAnagram(str1, str2))
// System.out.println("The two strings are anagram of each other");
// else
// System.out.println("The two strings are not anagram of each other");

// }

// }
