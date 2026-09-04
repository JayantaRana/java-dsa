import java.util.ArrayList;

//2 pointer approach
public class ConMostwater {
    public static int containerWater(ArrayList<Integer> height) {
        int Lp = 0;
        int Rp = height.size() - 1;
        int maxWater = 0;
        while (Lp < Rp) {
            int ht = Math.min(height.get(Lp), height.get(Rp));
            int width = Rp - Lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            if (height.get(Lp) < height.get(Rp)) {
                Lp++;
            } else {
                Rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(containerWater(height));
    }
}
