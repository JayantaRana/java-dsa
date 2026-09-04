public class Ifelse {

    public static void main(String[] args) {

        int age = 15;
        if ((age > 18) && (age < 20)) {
            System.out.println("Adult");
        } else if (age > 20) {
            System.out.println(" Senior");
        } else {
            System.out.println(" not adult");
        }
    }
}
