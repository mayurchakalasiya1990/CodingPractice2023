package datastructure.graph;

import java.util.ArrayList;

public class DFSUndirectedDisconnectedGraph {



    public void DFS(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited = new boolean[V+1];
        for (int i = 0; i < V; i++) {
            if(!visited[i])
                DSFRec(adj,i, visited);
        }

    }

    private void DSFRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print("Visited:"+s+" ");
        for (Integer u: adj.get(s)) {
            if(!visited[u]){
                DSFRec(adj,u,visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(3,4);
        graph.printAdjacencyList();
        DFSUndirectedDisconnectedGraph bsf= new DFSUndirectedDisconnectedGraph();
        bsf.DFS(graph.getAdj(), graph.getV());
    }
}
