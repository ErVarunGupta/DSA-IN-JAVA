import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Top_Sort_Using_BFS {
    //Kahn's Algorithm

    static int V = 6;
    static int graph[][] = new int[V][V];

    static void insertEdge(int u, int v){
        graph[u][v] = 1;
    }
    static void createGraph(){
        insertEdge(5, 2);
        insertEdge(5, 0);
        insertEdge(2, 3);
        insertEdge(4, 0);
        insertEdge(4, 1);
        insertEdge(3, 1);
    }

    static void top_Sort(){
        int inDeg[] = new int[V];
        for(int i = 0; i < V;i++){
            for(int j = 0; j < V; j++){
                if(graph[i][j] == 1){
                    inDeg[j]++;
                }
            }
        }
//        for(int i = 0; i < inDeg.length; i++){
//            System.out.print(inDeg[i]+" ");
//        }
        ArrayList<Integer> ans = new ArrayList<>();
        bfs(ans, inDeg);

        System.out.println(ans);
    }

    private static void bfs(ArrayList<Integer> ans, int inDeg[]){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(inDeg[i] == 0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int curr = q.remove();
            ans.add(curr);
            for(int i = 0; i < V; i++){
                if(graph[curr][i] == 1){
                    inDeg[i]--;
                    if(inDeg[i] == 0){
                        q.add(i);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        createGraph();
        top_Sort();
    }
}
