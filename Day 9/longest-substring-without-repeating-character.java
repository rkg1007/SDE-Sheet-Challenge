import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniqueSubstrings(String input) {
		int l = 0, r = 0, ans = 0;
        int[] freq = new int[26];
        
        while (r < input.length()) {
            int chIdx = input.charAt(r) - 'a';
            freq[chIdx]++;
            while (freq[chIdx] > 1) {
                freq[input.charAt(l++) - 'a']--;
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        
        return ans;
	}
}
