import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        boolean zerothCol = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (j == 0) zerothCol = true;
                    else matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                if (matrix[i][0] == 0) matrix[i][j] = 0;
                else {
                    if (j == 0) {
                        if (zerothCol) matrix[i][j] = 0;
                    } else if (matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
