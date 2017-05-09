package PrintMatrix_20;

/**
 * Created by bupt on 5/8/17.
 */
public class Solution {
    public static void printMatrix(int[][] matrix,int columns, int rows){
        if(matrix == null || columns <= 0 || rows <= 0 )
            return;
        int start = 0;
        while(columns >start * 2  && rows > start *2){
            printMatrixInCircle(matrix,columns,rows,start);
            start ++;
        }
    }

    public static void printMatrixInCircle(int[][] matrix,int columns,int rows,int start){
        int endY = rows -start -1;
        int endX = columns -start -1;
        for(int i = start;i <= endX;i++){
            System.out.println(matrix[start][i]);
        }
        if( start < endY){
            for(int i = start + 1;i <= endY;i++){
                System.out.println(matrix[i][endX]);
            }
        }
        if(start < endX && start < endY){
            for(int i = endX - 1; i >= start; i--){
                System.out.println(matrix[endY][i]);
            }
        }
        if(start <  endX && start < endY -1){
            for(int i = endY - 1; i >= start + 1;i--){
                System.out.println(matrix[i][start]);
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printMatrix(matrix, 4, 4);
    }
}
