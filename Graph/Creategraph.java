package Graph;

import java.util.ArrayList;

public class Creategraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

    }

    public static void main(String args[]) {
        /*
         * 0------1
         * / \
         * / \
         * 2 3
         * |
         * 4
         */

        int v = 5;
        // int arr[] =new int[5];
        // ArrayList<Integer> list = new ArrayList<Integer>();

        ArrayList<Edge> graph[] = new ArrayList[v];// null ->empty arrayList. Array<ArrayList>
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 --> vertex
        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        graph[4].add(new Edge(4, 2, 2));

        // 2's neighbors
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);// src,dest,wt
            System.out.println(e.dest);
        }

        // for understanding
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(2);
        // arr.add(3);
        // System.out.println(arr.get(1));
    }
}
