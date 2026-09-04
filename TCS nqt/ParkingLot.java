// Given a RxC matrix representing a parking lot: 
// • 0 represents an empty space. 
// • 1 represents a filled space. 
// Find the row with the most 1s (i.e., the row with the most occupied spaces).

import java.util.Scanner;

public class ParkingLot {

    public static void printArr(int row, int col, int arr[][]) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void parkingLot(int row, int col, int arr[][]) {
        int countOne = 0;
        int maxOne = 0;
        int maxRow = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) {
                    countOne++;
                }
            }
            if (countOne > maxOne) {
                maxOne = countOne;
                maxRow = i + 1;

            }

        }
        System.out.println("maswer " + maxRow);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row");
        int row = sc.nextInt();
        System.out.println("Enter column");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter value only 0 or 1....");
                arr[i][j] = sc.nextInt();
            }
        }

        printArr(row, col, arr);
        parkingLot(row, col, arr);

    }
}
