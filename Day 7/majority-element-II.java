import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        ArrayList<Integer> res = new ArrayList<>();
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > arr.size() / 3) {
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
