package TwoDimentional;

public class SpiralMatrix {
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startCol <= endCol && startRow <= endRow){
            //Top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //Right
            for(int i = startRow+1; i <= endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //Bottom
            for(int j = endCol - 1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i = endRow-1; i >= startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
//                {1, 2, 3},
//                {5, 6, 7},
                {9, 10, 11}

        };
        spiralMatrix(matrix);
    }
}
