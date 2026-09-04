public class AllFunctions {
    public static void main(String args[]) {
        // Concatenation
        String str1 = "jayanta";
        String str2 = "rana";

        System.out.println("Convert to upper case.....");
        System.out.println(str1.toUpperCase());

        System.out.println("Concatination example....");
        System.out.println(str1 + " " + str2);

        // String Length method
        System.out.println("String length example......");
        System.out.println(str1.length());

        // String charAt method
        System.out.println("String  charAt example......");
        System.out.println(str1.charAt(3));

        // Compare two strings
        System.out.println("Compare twop string.......");
        System.out.println(str1.equals(str2));

        // substring *egnore last index
        System.out.println("Substring..........");
        System.out.println(str1.substring(0, 3));

        // compareTo method
        System.out.println("Compare to .......");
        System.out.println(str1.compareTo(str2));

        System.out.println(str1.compareToIgnoreCase(str2));
    }
}
