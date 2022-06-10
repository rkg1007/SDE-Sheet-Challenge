import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    
    static boolean binarySearch(ArrayList<Integer> arr, int target) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int num = arr.get(m);
            if (num < target) l = m + 1;
            else if (num > target) r = m - 1;
            else return true;
        }
        return false;
    }
    
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		for (int i = 0; i < m; i++) {
            if (binarySearch(mat.get(i), target)) return true;
        }
        return false;
	}
}
