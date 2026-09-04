import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(sc.nextInt(), sc.nextLine());
        System.out.println(map.get(12));
    }
}