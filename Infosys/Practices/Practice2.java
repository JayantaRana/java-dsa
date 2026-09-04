package Infosys.Practices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Practice2 {

    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt;
        }
    }

    static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    public static int par[];
    public static int rank[];

    public static void init(int n) {
        par = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            par[i] = i;
        }

    }

    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }
        return par[x] = find(x);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }

    }

    public static int krushkalsMST(ArrayList<Edge> edges, int v) {
        init(v);

        Collections.sort(edges);
        int mstCost = 0;
        for (int i = 0; i < v - 1; i++) {
            Edge e = edges.get(i);
            int src = e.src;
            int dest = e.dest;
            int wt = e.wt;

            int parA = find(src);
            int parB = find(dest);

            if (parA != parB) {
                union(src, dest);
                mstCost += wt;
            }
        }

        return mstCost;

    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        krushkalsMST(edges, v);
    }
}
