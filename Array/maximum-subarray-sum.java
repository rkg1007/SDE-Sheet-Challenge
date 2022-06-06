import java.util.* ;
import java.io.*; 

public class Solution {
	public static long maxSubarraySum(int[] arr, int n) {
		long sum = 0;
        long currSum = 0;
        for (int num : arr) {
            currSum += num;
            sum = Math.max(sum, currSum);
            currSum = Math.max(currSum, 0);
        }
        return sum;
	}
}
