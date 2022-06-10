import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		int candidate = -1, freq = 0;
        for (int num : arr) {
            if (freq == 0) candidate = num;
            if (num == candidate) freq++;
            else freq--;
        }
        
        freq = 0;
        for (int num : arr) if (candidate == num) freq++;
        return freq > n / 2 ? candidate : -1;
	}
}
