import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(8);
        list.add(20);
        list.add(2);
        list.add(9);
        System.out.println(list);
        Collections.sort(list);// acending order
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());// descending order
        System.out.println(list);
    }
}
