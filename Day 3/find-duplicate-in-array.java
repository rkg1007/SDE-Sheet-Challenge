import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            int idx = Math.abs(arr.get(i));
            int val = arr.get(idx);
            if (val < 0) ans = idx;
            else arr.set(idx, -val);
        }
        return ans;
    }
}
