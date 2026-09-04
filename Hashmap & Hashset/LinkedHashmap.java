import java.util.LinkedHashMap;

// key are insertion order
public class LinkedHashmap {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        // insertion
        lhm.put("kolkata", 100);
        lhm.put("Howrah", 120);
        lhm.put("Delhi", 500);

        System.out.println(lhm);
        // output Kolkata -->Howrah --->Delhi (insertion order)
    }
}
