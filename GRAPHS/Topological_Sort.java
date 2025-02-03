import java.util.Stack;

public class Topological_Sort {
    static int V = 6;
    static int graph[][] = new int[V][V];

    static void insertEdge(int u, int v){
        graph[u][v] = 1;
    }
    static void createGraph(){
        insertEdge(5, 0);
        insertEdge(5, 2);
        insertEdge(2, 3);
        insertEdge(3, 1);
        insertEdge(4, 1);
        insertEdge(4, 0);
    }

    static void topSort(int src){
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(i,stack, vis);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    }

    private static void dfs(int v, Stack<Integer> stack, boolean vis[]){
        vis[v] = true;

        for(int i = 0; i < V; i++){
            if(!vis[i] && graph[v][i] != 0){
                dfs(i, stack, vis);
            }
        }

        stack.push(v);
    }
    public static void main(String[] args) {
        createGraph();
        topSort(0);
    }
}
