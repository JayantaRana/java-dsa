import java.util.ArrayList;

public class PrintReverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();// TC: O(n)
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(60);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
