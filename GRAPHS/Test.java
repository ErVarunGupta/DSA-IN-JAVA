public class Test {
    static int V= 6;
    static int graph[][] = new int[V][V];

    private static void insertEdge(int u, int v,int w){
        graph[u][v] = w;
    }
    static void createGraph(){
        insertEdge(0, 1, 2);
        insertEdge(0, 2, 4);
        insertEdge(1, 2, 1);
        insertEdge(1, 3, 7);
        insertEdge(2, 4, 3);
        insertEdge( 3, 5, 1);
        insertEdge( 4, 3, 2);
        insertEdge( 4, 5, 5);
    }

    static int findMinIndex(int dist[], boolean vis[]){
        int minIndx = -1, minVal = Integer.MAX_VALUE;

        for(int i = 0; i < V; i++){
            if(!vis[i] && dist[i] < minVal){
                minIndx = i;
                minVal = dist[i];
            }
        }
        return minIndx;
    }

    static void dijkstra(int src){
        int dist[] = new int[V];
        boolean vis[] = new boolean[V];

        for(int i = 0; i < V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for(int i = 0; i < V; i++){
            int u = findMinIndex(dist, vis);
            vis[u] = true;
            for(int v = 0; v < V; v++){
                if(!vis[v] && dist[u] + graph[u][v] < dist[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE){
                    dist[v] = dist[u]+graph[u][v];
                }
            }
        }

        for(int i = 0; i < V; i++){
            System.out.print(dist[i]+" ");
        }
    }

    public static void main(String[] args) {
        createGraph();
        dijkstra(0);
    }
}
