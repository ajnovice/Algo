package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {

    private static class Graph {
        int V;
        LinkedList<Integer> adj[];

        Graph(int V) {
            this.V = V;
            adj = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new LinkedList<>();
            }

        }

        void addEdge(int src, int dest) {
            adj[src].add(dest);
            adj[dest].add(src);
        }

        void DFSTraversal(int s) {
            boolean[] visited = new boolean[V];
            Arrays.fill(visited, false);
            Stack<Integer> stack = new Stack<>();
            stack.add(s);
            visited[s] = true;
            while (stack.size() > 0) {
                int k = stack.pop();

                System.out.println(k);
                for (int i = 0; i < adj[k].size(); i++) {
                    if (!visited[adj[k].get(i)]) {
                        stack.add(adj[k].get(i));
                        visited[adj[k].get(i)] = true;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        for (int i = 0; i < 4; i++) {
            int N = g.adj[i].size();
            System.out.print(g.adj[i].get(0));
            for (int j = 1; j < N; j++) {
                System.out.print("--->" + g.adj[i].get(j));
            }
            System.out.println(" ");
        }

        g.DFSTraversal(2);

    }
}
