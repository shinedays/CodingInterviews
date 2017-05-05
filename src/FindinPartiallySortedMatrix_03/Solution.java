package FindinPartiallySortedMatrix_03;

/**
 * Created by bupt on 5/2/17.
 */
public class Solution {
    static boolean find(int[][] matrix,int rows, int columns, int number){
        boolean res = false;
        if(matrix != null && rows > 0 && columns > 0){
            int row = 0;
            int column = columns - 1;
            while(row < rows && column < columns){
                if(matrix[row][column] == number){
                    res = true;
                    break;
                } else if(matrix[row][column] > number){
                    column --;
                } else
                    row ++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(find(matrix,4,4,14));
    }
}
