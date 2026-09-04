// A furnishing company packs aqua (a) and black (b) curtains into boxes. Each box can hold L 
// curtains. Your task is to find the maximum count of 'a' curtains in any box when the string is 
// divided into equal groups of size L. 
// Input: 
// ababababab 
// 2 
// Calculation: 
// • "ab" → 1 'a' 
// • "ab" → 1 'a' 
// • "ab" → 1 'a' 
// • "ab" → 1 'a' 
// • "ab" → 1 'a' 
// Output : 1

// curtainString = "bbbaaababa" 
// L = 3 
// Dividing into Boxes (L = 3): 
// 1st Box: "bbb" → contains 0 'a'   
// 2nd Box: "aaa" → contains 3 'a'   
// 3rd Box: "bab" → contains 1 'a'   
// 4th Box: "a" (leftover, ignored)   
// Output: 
// 3

public class CurtainPackingChallenge {

  public static int maxACountInBox(String Str, int L) {
    int maxA = 0;
    for (int i = 0; i + L <= Str.length(); i = i + L) {
      String subString = Str.substring(i, i + L);
      int countA = 0;

      for (int j = 0; j < subString.length(); j++) {
        if (subString.charAt(j) == 'a') {
          countA++;
        }
      }

      maxA = Math.max(maxA, countA);
    }
    return maxA;
  }

  public static void main(String[] args) {
    String str = "bbbaaababa";
    int L = 4;

    System.out.println(maxACountInBox(str, L));
  }
}
