import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // insert add(key)
        set.add(12);
        set.add(5);
        set.add(4);
        set.add(5);
        set.add(8);
        // contains(key)
        System.out.println(set.contains(5));

        // remove(key)
        set.remove(8);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
