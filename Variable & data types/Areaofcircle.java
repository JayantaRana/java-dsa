import java.util.Scanner;

public class Areaofcircle {
    public static void main(String args[]) {
        final float PI = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radious value ");
        float rad = sc.nextFloat();
        float area = PI * rad * rad;

        System.out.println(area);
    }

}
