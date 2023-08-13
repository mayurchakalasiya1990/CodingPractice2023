package datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSUndirectedDisconnectedGraph {

    public void BFS(ArrayList<ArrayList<Integer>> adj, int V, int s){
        boolean[] visited = new boolean[V+1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int u = q.poll();
            visited[u] = true;
            System.out.println("Visited:"+u+" ");
            for (int v : adj.get(u)){
                if(!visited[v]){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(2,3);
        graph.addEdge(2,1);
        graph.addEdge(3,4);

        graph.printAdjacencyList();
        BFSUndirectedDisconnectedGraph bsf= new BFSUndirectedDisconnectedGraph();
        bsf.BFS(graph.getAdj(), graph.getV(), 0);

    }
}
