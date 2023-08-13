package datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSUndirectedGraph {

    private static void BFS(ArrayList<ArrayList<Integer>> adj, int V, int s, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
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


    public int BFSDisconnected(ArrayList<ArrayList<Integer>> adj, int V){
        int count=0;
        boolean[] visited = new boolean[V+1];
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                BFS(adj,V, i,visited);
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(4,5);
        graph.addEdge(4,6);
        graph.addEdge(5,6);
        graph.printAdjacencyList();
        BFSUndirectedGraph bsf= new BFSUndirectedGraph();
        System.out.println("Number of Connected Component:"+bsf.BFSDisconnected(graph.getAdj(), graph.getV()));

    }
}
