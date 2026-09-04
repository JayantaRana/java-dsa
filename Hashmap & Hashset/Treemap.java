import java.util.TreeMap;

//keys are sorted
public class Treemap {
    public static void main(String args[]) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("kolkata", 100);
        tm.put("Howrah", 120);
        tm.put("Delhi", 500);
        System.out.println(tm);
        // output Delhi-->Howrah--->Kolkata (keys are sorted : H come after D)
    }
}
