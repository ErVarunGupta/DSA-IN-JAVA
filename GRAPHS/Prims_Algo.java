import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims_Algo {

    static int V = 4;
    private static void insertEdge(int graph[][], int u, int v, int w){
        graph[u][v] = w;
        graph[v][u] = w;
    }
    static void createGraph(int graph[][]){
        insertEdge(graph, 0, 1, 10);
        insertEdge(graph, 0, 2, 15);
        insertEdge(graph, 0, 3, 30);
        insertEdge(graph, 1, 3, 40);
        insertEdge(graph, 2, 3, 50);
    }

    static class Pairs implements Comparable<Pairs>{
        int vertex;
        int cost;

        Pairs(int v, int c){
            this.vertex = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pairs p2){//Ascending order sorting
            return this.cost - p2.cost;
        }
    }

    static void prims(int graph[][], int src){
        boolean vis[] = new boolean[V];
        PriorityQueue<Pairs> pq = new PriorityQueue<>();
        ArrayList<Integer> edge = new ArrayList<>();

        pq.add(new Pairs(src, 0));
        int ans = 0;

        while(!pq.isEmpty()){
            Pairs curr = pq.remove();
            if(!vis[curr.vertex]){
                vis[curr.vertex] = true;
                ans += curr.cost;
                edge.add(curr.cost);

                for(int j = 0; j < V; j++){
                    if(!vis[j] && graph[curr.vertex][j] != Integer.MAX_VALUE){
                        pq.add(new Pairs(j, graph[curr.vertex][j]));
                    }
                }
            }
        }

        System.out.println("final min cost = "+ans);
        System.out.println("All MST edge: "+edge);
    }
    public static void main(String[] args) {
        int graph[][] = new int[V][V];
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[0].length;j++){
                graph[i][j] = Integer.MAX_VALUE;
            }
        }
        createGraph(graph);

        int src = 0;
        prims(graph, src);
    }
}
