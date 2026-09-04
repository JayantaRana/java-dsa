import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // take value from user for matrix
        System.out.println("enter value...");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // print matrix
        System.out.println("------------------");
        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
