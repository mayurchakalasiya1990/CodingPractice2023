package datastructure.graph;

import java.util.ArrayList;

public class Graph {

    private int V;

    private ArrayList<ArrayList<Integer>> adj;
    public Graph(int V){
        this.V = V;
        this.adj = new ArrayList<ArrayList<Integer>>(V);
        for (int v = 0; v < V; v++) {
            this.adj.add(new ArrayList<Integer>());
        }
    }

    public void addNode(int v){
        this.adj.set(v,new ArrayList<Integer>());
    }
    public void addEdge(int a, int b){
        this.adj.get(a).add(b);
        this.adj.get(b).add(a);
    }

    public void printAdjacencyList()
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list of " + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public int getV() {
        return V;
    }

    public ArrayList<ArrayList<Integer>> getAdj() {
        return adj;
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
    }

}
