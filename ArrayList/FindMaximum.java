import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(12);
        list.add(11);
        list.add(8);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) { // Tc: O(n)
            // if (list.get(i) > max) {
            // max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("maximum is " + max);
    }
}
