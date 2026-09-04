import java.util.ArrayList;

public class MultiDimensional {
    public static void main(String[] args) {
        // ArrayList<Integer>list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);
        System.out.println(list2);

        mainList.add(list1);
        mainList.add(list2);
        // System.out.println(mainList);
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
