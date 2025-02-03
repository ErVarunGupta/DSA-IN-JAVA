package Strings;

/* Given a route containing 4 directions (E,W,N,S),
find the shortest path to reach destination.
"WNEENESENNN"
 */
public class Q2_ShortestPath {
    public static float getShortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length(); i++){
            //East
            if(path.charAt(i) == 'E'){
                x++;
            }
            //West
            else if(path.charAt(i) == 'W'){
                x--;
            }
            //North
            else if(path.charAt(i) == 'N'){
                y++;
            }
            //South
            else{
                y--;
            }
        }
        return (float)Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
