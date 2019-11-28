package Graph;

import java.util.LinkedList;

public class AdjacencyList {

    private static class Graph{
        int V;
        LinkedList<Integer> adj[];
        Graph(int V){
            this.V=V;
            adj = new LinkedList[V];
            for(int i=0;i<V;i++){
                adj[i]=new LinkedList<>();
            }
        }
    }

    private static void addEdge(Graph graph,int src,int dest){
        graph.adj[src].add(dest);
        graph.adj[dest].add(src);

    }

    public static void main(String[] args){
        int V=5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        for(int i=0;i<V;i++){
            int N = graph.adj[i].size();
            System.out.print(graph.adj[i].get(0));
            for(int j=1;j<N;j++){
                System.out.print("--->"+graph.adj[i].get(j));
            }
            System.out.println(" ");
        }

    }
}
