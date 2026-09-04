package Infosys;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MimimumMakespanMachine {

    static class Server implements Comparable<Server> {
        int sid;
        int taskCount;
        int sload;

        public Server(int sid, int taskCount, int sload) {
            this.sid = sid;
            this.taskCount = taskCount;
            this.sload = sload;
        }

        @Override
        public int compareTo(Server s2) {
            if (this.sload == s2.sload) {
                return Integer.compare(this.sid, s2.sid);
            }
            return Integer.compare(this.sload, s2.sload);
        }
    }

    static class Task implements Comparable<Task> {
        int taskId;
        int time;

        public Task(int taskId, int time) {
            this.taskId = taskId;
            this.time = time;
        }

        @Override
        public int compareTo(Task t2) {
            if (this.time == t2.time) {
                return this.taskId - t2.taskId;
            }
            return t2.time - this.time;
        }
    }

    public static int solve(int N, int M, int W, int tasks[]) {

        // step - 1
        Task taskList[] = new Task[N];
        for (int i = 0; i < N; i++) {
            taskList[i] = new Task(i, tasks[i]);
        }
        Arrays.sort(taskList);

        // step - 2
        PriorityQueue<Server> server = new PriorityQueue<>();
        for (int i = 0; i < M; i++) {
            server.offer(new Server(i, 0, 0));
        }

        // step-3
        for (Task task : taskList) {
            Server s = server.poll();

            int time = task.time + (s.taskCount * W);
            s.sload += time;
            s.taskCount++;
            server.offer(s);
        }

        // step-4
        int maxLoad = 0;
        for (Server s : server) {
            maxLoad = Math.max(maxLoad, s.sload);
        }

        return maxLoad;

    }

    public static void main(String[] args) {
        int N = 5;
        int M = 2;
        int W = 5;
        int arr[] = { 10, 20, 20, 10, 5 };

        System.out.println(solve(N, M, W, arr));

    }
}
