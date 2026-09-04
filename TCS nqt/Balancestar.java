// Balance '*' and '#' 
// Given a string made of '*' and '#', determine how many more of each character you need to add to 
// make the string valid (where the number of " and '#' are equal).

// • If '*' > '#', output a positive integer showing how many '*' are extra. Check captions for detailed 
// explanation 
// • If '#' > '*', output a negative integer showing how many '#' are extra. 
// • If '*' = '#', output O!

import java.util.Scanner;

public class Balancestar {
    public static void count(String str) {
        int starCount = 0;
        int hashCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                starCount++;
            } else if (str.charAt(i) == '#') {
                hashCount++;
            }
        }
        System.out.println(starCount - hashCount);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String .....");
        String str = sc.nextLine();
        count(str);
    }
}
