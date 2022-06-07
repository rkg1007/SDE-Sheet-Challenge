import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int idx = m + n - 1;
        while (idx >= 0) {
            if (m == 0 || (n > 0 && arr2[n-1] >= arr1[m-1])) {
                arr1[idx--] = arr2[--n];
            } else {
                arr1[idx--] = arr1[--m];
            }
        }
        return arr1;
    }
}
