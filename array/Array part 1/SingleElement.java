
public class SingleElement {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 4, 1, 2, 6, 6 };
        int xor = 0;
        for (int n : arr) {
            xor ^= n;
        }

        System.out.println("Single element: " + xor);
    }
}
