public class Forloop {
    public static void main(String args[]) {
        for (int i = 0; 5 > i; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Hello world  " + i);

        }
    }
}
