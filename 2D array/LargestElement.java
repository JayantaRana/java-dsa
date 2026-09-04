public class LargestElement {
    public static void printLargest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];

                }
                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("your largest element is " + largest);
        System.out.println("your smallest element is " + smallest);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 60, 45, 78 },
                { 56, 4, 10 },
                { 80, 12, 14 } };

        printLargest(matrix);
    }
}
