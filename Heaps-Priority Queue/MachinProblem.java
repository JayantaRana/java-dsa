import java.util.Arrays;

import java.util.PriorityQueue;
//TC: O(N log N + M log M + N log M)

public class MachinProblem {
    static class Server implements Comparable<Server> {
        int id;
        int load;
        int taskCount;

        public Server(int id, int load, int taskCount) {
            this.id = id;
            this.load = load;
            this.taskCount = taskCount;
        }

        @Override
        public int compareTo(Server s2) {
            if (this.load == s2.load) {
                return Integer.compare(this.id, s2.id);
            }
            return Integer.compare(this.load, s2.load);
        }

    }

    public static void main(String[] args) {
        int tasks[] = { 5, 4, 3, 2, 1 };
        Arrays.sort(tasks);
        int N = 5;
        int M = 2;
        int W = 0;

        PriorityQueue<Server> pq = new PriorityQueue<>();
        for (int i = 0; i < M; i++) {
            pq.add(new Server(i, 0, 0));
        }

        int maxLoad = 0;
        for (int i = tasks.length - 1; i >= 0; i--) {
            int task = tasks[i];
            Server s = pq.poll();
            s.load += task + s.taskCount * W;
            s.taskCount++;

            maxLoad = Math.max(maxLoad, s.load);
            pq.add(s);
        }

        System.out.println("Max load is " + maxLoad);
    }
}
