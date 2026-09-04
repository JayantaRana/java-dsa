import java.util.HashSet;
import java.util.Iterator;

public class HashsetIteration {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("kolkata");
        cities.add("Noida");

        // using iterators
        Iterator it = cities.iterator();
        System.out.println(it);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // using advanced loop
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
