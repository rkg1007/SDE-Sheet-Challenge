import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		int[] row = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) row[j] = 1;
                else {
                    row[j] += row[j - 1];
                }
            }
        }
        return row[n - 1];
	}
}
