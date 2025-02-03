package Part_2.PracticeProblem;

public class Q5_TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi('A','C','B',3);
    }
    static int total = 3;
    public static void towerOfHanoi(char src, char dest, char aux, int n){
        if(n == 0){
            return;
        }

        towerOfHanoi(src,aux,dest,n-1);

        System.out.println((total - n + 1)+". disc move from "+src+" tower to "+dest+" tower");

        towerOfHanoi(aux,dest,src,n-1);
    }
}
