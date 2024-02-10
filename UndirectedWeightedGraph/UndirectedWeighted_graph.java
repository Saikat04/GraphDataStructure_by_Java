// package GraphDataStructure_by_Java.UndirectedWeightedGraph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class UndirectedWeighted_graph {
    
    static class Edge {
        int src;
        int dest;
        int weight;
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
        public static void createGraph(ArrayList<Edge> graph[]) {
            for(int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<Edge>();
            }

            graph[0].add(new Edge(0, 2, 2));

            graph[1].add(new Edge(1, 2, 10));
            graph[1].add(new Edge(1, 3, 0));

            graph[2].add(new Edge(2, 0, 2));
            graph[2].add(new Edge(2, 1, 10));
            graph[2].add(new Edge(2, 3, -1));

            graph[3].add(new Edge(3, 1, 0));
            graph[3].add(new Edge(3,2,-1));
        }    

    public static void main(String arg[]) {

        ArrayList<Edge> graph[] = new ArrayList[4];
        createGraph(graph);

        //0's neighbour with weight
        for(int i = 0; i < graph[0].size(); i++){
            Edge E = graph[0].get(i);
            System.out.println("Source: "+E.src+" Destination: "+E.dest+" Weight: "+E.weight);
        }

        //1's neighbour
        for(int i = 0;i < graph[1].size(); i++) {
            Edge E1 = graph[1].get(i);
            System.out.println("Source: "+E1.src+" Destination: "+E1.dest+" Weight: "+E1.weight);
        }

    }
}
