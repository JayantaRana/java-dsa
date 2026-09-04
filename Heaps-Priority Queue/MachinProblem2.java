import java.util.*;

class MachinProblem2 {
    public static int solve(int N, int M, int W, int[] tasks) {

        // Custom class to keep track of a task's original index
        class Task implements Comparable<Task> {
            int time;
            int index;

            Task(int time, int index) {
                this.time = time;
                this.index = index;
            }

            // Sort by time descending; if equal, by index ascending
            public int compareTo(Task other) {
                if (this.time != other.time) {
                    return Integer.compare(other.time, this.time);
                }
                return Integer.compare(this.index, other.index);
            }
        }

        // Custom class to keep track of a server's state
        class Server implements Comparable<Server> {
            int id;
            long load;
            int taskCount;

            Server(int id) {
                this.id = id;
                this.load = 0;
                this.taskCount = 0;
            }

            // Prioritize lowest load; if equal, lowest server ID
            public int compareTo(Server other) {
                if (this.load != other.load) {
                    return Long.compare(this.load, other.load);
                }
                return Integer.compare(this.id, other.id);
            }
        }

        // 1 & 2. Prepare and sort tasks
        Task[] taskList = new Task[N];
        for (int i = 0; i < N; i++) {
            taskList[i] = new Task(tasks[i], i);
        }
        Arrays.sort(taskList);

        // 3. Initialize Server Priority Queue
        PriorityQueue<Server> pq = new PriorityQueue<>();
        for (int i = 0; i < M; i++) {
            pq.offer(new Server(i));
        }

        // 4. Dispatch tasks
        for (Task task : taskList) {
            Server server = pq.poll();

            // Apply Thermal Throttling
            long actualTime = task.time + ((long) server.taskCount * W);
            server.load += actualTime;
            server.taskCount++;

            pq.offer(server);
        }

        // 5. Find the maximum makespan
        long maxLoad = 0;
        for (Server server : pq) {
            maxLoad = Math.max(maxLoad, server.load);
        }

        return (int) maxLoad;
    }

    public static void main(String[] args) {
        int tasks[] = { 10, 20, 20, 10 };
        int N = 4;
        int M = 2;
        int W = 5;
        System.out.println(solve(N, M, W, tasks));
    }
}
