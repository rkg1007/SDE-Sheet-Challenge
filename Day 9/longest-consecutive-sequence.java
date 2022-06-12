import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        HashSet<Integer> arrSet = new HashSet<>();
        for (int num : arr) arrSet.add(num);
       
        int ans = 0;
        for (int num : arr) {
            if (!arrSet.contains(num - 1)) {
                int currStreak = 0;
                while (arrSet.contains(num)) {
                    currStreak++;
                    num++;
                }
                ans = Math.max(ans, currStreak);
            }
        }
        
        return ans;
    }
}
