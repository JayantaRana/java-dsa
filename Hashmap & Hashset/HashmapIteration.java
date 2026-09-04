import java.util.HashMap;
import java.util.Set;

public class HashmapIteration {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("kolkata", 200);
        hm.put("Medinipur", 100);
        hm.put("Keshpur", 110);
        hm.put("Ghatal", 250);
        hm.put("Madhupur", 400);

        System.out.println(hm);

        // Iteration
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // foreach loop
        for (String k : keys) {
            System.out.println("key= " + k + "," + "value= " + hm.get(k));
        }
        System.out.println(hm.hashCode());
    }
}
