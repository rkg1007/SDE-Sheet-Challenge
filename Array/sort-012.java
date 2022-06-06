import java.util.* ;
import java.io.*; 
public class Solution {
    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    
    public static void sort012(int[] arr){
        int i = 0, l = 0, r = arr.length - 1;
        while (i <= r) {
            if (arr[i] == 0) {
                swap(arr, l++, i);
            } else if (arr[i] == 2) {
                swap(arr, i, r--);
            } else {
                i++;
            }
            i = Math.max(i, l);
        }
    }
}
