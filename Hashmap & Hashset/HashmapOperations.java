import java.util.HashMap;

public class HashmapOperations {
    public static void main(String args[]) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        System.out.println(hm.isEmpty());
        // Insert ---> put(key,value)
        hm.put("India", 100);
        hm.put("China", 500);
        hm.put("US", 50);

        System.out.println(hm);

        // get(key)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("US"));
        System.out.println(hm.get("kolkata"));

        // containsKey
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("kolkata"));// false

        // remove(key)
        hm.remove("India");
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // clear
        hm.clear();
        // IsEmpty
        System.out.println(hm.isEmpty());

    }
}
