package Graph_part02;

import java.util.ArrayList;
import java.util.Stack;

public class Topological_Sorting {  //O(V+E)
    static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack){
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    static void topologicaSort(ArrayList<Edge>[] graph){
        boolean vis[]  = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                dfs(graph, i, vis, stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topologicaSort(graph);
    }
}
