import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> res = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            ArrayList<Long> row = new ArrayList<>(i);
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) row.add((long)1);
                else row.add(res.get(i-2).get(j-1) + res.get(i-2).get(j));
            }
            res.add(row);
        }
        return res;
	}
}
