package datastructure.graph;

import java.util.ArrayList;

public class DFSUndirectedGraph {



    public void DFS(ArrayList<ArrayList<Integer>> adj, int V, int s){
        boolean[] visited = new boolean[V+1];

        DSFRec(adj,s, visited);
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
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(1,4);
        graph.printAdjacencyList();
        DFSUndirectedGraph bsf= new DFSUndirectedGraph();
        bsf.DFS(graph.getAdj(), graph.getV(),0);
    }
}
