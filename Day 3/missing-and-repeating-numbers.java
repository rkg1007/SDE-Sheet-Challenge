import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] res = new int[2];
        
        for (int i = 0; i < arr.size(); i++) {
            int idx = Math.abs(arr.get(i)) - 1;
            int val = arr.get(idx);
            if (val < 0) res[1] = idx + 1;
            else arr.set(idx, -val);
        }
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) res[0] = i + 1;
        }
        
        return res;
    }
}
