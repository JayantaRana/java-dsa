import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter your elements ");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        // add element time complexity ----> O(1)
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(list);

        // get element time complexity ----> O(1)
        int element = list.get(0);
        System.out.println(element);

        // add element in between time complexity ----> O(n)
        list.add(0, 9);
        System.out.println(list);

        // set element time complexity ----> O(n)
        list.set(0, 56);
        System.out.println(list);

        // delete elment time complexity ----> O(n)
        list.remove(3);
        System.out.println(list);

        // time complexity ----> O(n)
        System.out.println(list.contains(11));

        // size
        int size = list.size();
        System.out.println(size);

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}