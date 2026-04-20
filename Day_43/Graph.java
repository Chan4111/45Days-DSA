package Day_43;

import java.util.*;

class Graph {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // undirected graph
    }

    void BFS(int start) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.println("BFS Traversal:");
        g.BFS(0);
    }
}
