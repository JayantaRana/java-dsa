class StringCharAt {
    // print all letters
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    // print only samall letters
    public static void printSmallLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && 'z' >= str.charAt(i)) {
                System.out.print(str.charAt(i) + " ");
            }
        }
        System.out.println();
    }

    // print only small letters second method using java method
    public static void SmallLatters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                System.out.print(str.charAt(i) + " ");
            }
        }
        System.out.println();
    }

    // print only capital letter of a given string
    public static void CapitalLatters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                System.out.print(str.charAt(i) + " ");
            }
        }
        System.out.println();
    }

    // print only capital letters of a given string using java method
    public static void printCapitalLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && 'Z' >= str.charAt(i)) {
                System.out.print(str.charAt(i) + " ");
            }
        }
        System.out.println();
    }

    // Java Lower case method
    public static void LowerCase(String str) {
        System.out.println(str.toLowerCase());
    }

    // Java Upper case method
    public static void UpperrCase(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void main(String args[]) {
        String hello = "Susanta  Rana";
        String str = "jayanta rana";
        // System.out.println(str);
        // System.out.println(str.charAt(4));// count whitespace
        // printLetters(str);
        // printSmallLetters(str);
        // CapitalLatters(str);
        // SmallLatters(str);

        // String strLower = str.toLowerCase();
        // System.out.println(str.toUpperCase());
        LowerCase(hello);
        UpperrCase(str);

    }
}