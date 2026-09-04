import java.util.ArrayList;

//BruteForce approach
public class ContainerWithMWater {
    public static int containerWater(ArrayList<Integer> list) {
        int maxWater = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int w = j - i;
                int ht = Math.min(list.get(i), list.get(j));
                int totalWater = w * ht;
                // if (maxWater < totalWater) {
                // maxWater = totalWater;
                // }
                maxWater = Math.max(maxWater, totalWater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(containerWater(list));
    }
}
