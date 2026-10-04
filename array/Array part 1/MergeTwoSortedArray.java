public class MergeTwoSortedArray {
    public static void merge(int A[], int B[], int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int idx = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (A[i] >= B[j]) {
                A[idx] = A[i];

                idx--;
                i--;
            } else {
                A[idx] = B[j];
                idx--;
                j--;
            }
        }

        while (j >= 0) {
            A[idx] = B[j];

            idx--;
            j--;
        }
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int B[] = { 2, 5, 6 };
        int n = 3;
        merge(A, B, m, n);

        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
