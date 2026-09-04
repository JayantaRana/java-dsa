package Infosys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Practice {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }

    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (stack[e.dest]) {
                return true;
            }
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]) {
        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topoSort(ArrayList<Edge> graph[]) {
        int indeg[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        Arrays.fill(indeg, 0);
        // create indeg
        calcIndeg(graph, indeg);

        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        // bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.println(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);

                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }

        System.out.println();
    }

    public static void printpath(ArrayList<Edge> graph[], int src, int dest, String path) {

        if (src == dest) {
            System.out.print(path + dest);
            return;
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printpath(graph, e.dest, dest, path + src);
        }
    }

    public static int solve(int N, int days, int weights[]) {
        int minCapacity = Integer.MAX_VALUE; // final answer

        int min = Integer.MIN_VALUE;
        int max = 0;
        for (int w : weights) {
            if (min < w) {
                min = w;
            }
            max += w;

        }

        int n = (max - min) + 1;
        int cap[] = new int[n]; // posible capacity array
        // create capacity array
        for (int i = 0; i < n; i++) {
            cap[i] = min;
            min++;
        }

        // bianary search
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (isPossible(cap[mid])) { // leter implement isPossible for this container
                right = mid - 1;
            } else if (!isPossible(cap[mid])) {
                left = mid + 1;
            }

            minCapacity = cap[left];
        }
    }

    // for(int i = 1; i <= day; i++) {
    // int dayCapacity;
    // if(i % 2 == 0) {
    // dayCapacity = capacity /2;
    // } else {
    // dayCapacity = capacity;
    // }
    // int totalCapacity = 0;
    // while(!q.isEmpty() && q.peek() + totalCapacity <= dayCapacity){
    // totalCapacity += q.remove();
    // }
    // }
    public static void main(String args[]) {
        /*
         * 0------1
         * / \
         * / \
         * 2 3
         * |
         * 4
         */

        int v = 4;
        // int arr[] =new int[5];
        // ArrayList<Integer> list = new ArrayList<Integer>();

        ArrayList<Edge> graph[] = new ArrayList[v];// null ->empty arrayList. Array<ArrayList>
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 --> vertex
        // graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 3));
        // graph[2].add(new Edge(2, 4));

        // graph[3].add(new Edge(3, 0));
        // graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 2));

        // graph[4].add(new Edge(4, 2));
        // // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // // graph[5].add(new Edge(5, 4));
        // graph[5].add(new Edge(5, 6));

        // graph[6].add(new Edge(6, 5));

        // bfs(graph);
        // System.out.println(hashPath(graph, 0, 5, new boolean[graph.length]));
        // System.out.println(isCycle(graph));
        System.out.println(isCycle(graph));
    }
}
