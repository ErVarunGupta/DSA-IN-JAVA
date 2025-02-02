package Graph_part05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Cheapest_Flights {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int c){
            this.src = s;
            this.dest = d;
            this.wt = c;
        }
    }

    static void createGraph(int flights[][], ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < flights.length; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            graph[src].add(new Edge(src, dest, wt));
        }
    }

    static class Info{
        int vertex;
        int cost;
        int stops;

        Info(int v, int c, int s){
            this.vertex = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlights(int n, int flights[][], int src, int dest, int k){
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flights, graph);

        int dist[] = new int[n];
        for(int i = 0; i < n; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops > k){
                break;
            }

            //visit neighbours
            for(int i = 0; i < graph[curr.vertex].size(); i++){
                Edge e = graph[curr.vertex].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                //replace dist[u] to curr.cost
                if(curr.cost+wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.cost+wt;
                    q.add(new Info(v, dist[v], curr.stops +1));
                }
            }
        }

        //dist[dest]
        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }

    public static void main(String[] args) {
        int flights[][] = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0;
        int dst = 3;
        int k = 1;

        int ans = cheapestFlights(flights.length, flights, src, dst, k);
        System.out.println(ans);
    }
}
