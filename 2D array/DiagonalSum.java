public class DiagonalSum {
    public static void printDiagonalSum(int matrix[][]) {// TC:O(n^2); BruteForce Approach
        // primary diagonal
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                    // secondary diagonal
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("your sum is " + sum);
    }

    public static void optimizedCode(int matrix[][]) {// TC: O(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("your sum is  " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 0, 1, 2 },
                { 3, 4, 5 },
                { 6, 7, 8 }
        };
        // printDiagonalSum(matrix);
        optimizedCode(matrix);
    }
}
