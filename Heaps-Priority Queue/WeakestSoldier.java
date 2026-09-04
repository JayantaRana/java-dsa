import java.util.PriorityQueue;

public class WeakestSoldier {
    static class Row implements Comparable<Row> {
        int solCount;
        int idx;

        public Row(int solCount, int idx) {
            this.solCount = solCount;
            this.idx = idx;
        }

        public int compareTo(Row r2) {

            if (this.solCount != r2.solCount) {
                return this.solCount - r2.solCount;
            }
            return this.idx - r2.idx;

        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int M = 4;
        int N = 4;
        int K = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                count += arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }

        for (int i = 0; i < K; i++) {
            System.out.println("R" + pq.remove().idx);
        }

    }
}
