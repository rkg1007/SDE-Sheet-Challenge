import java.util.* ;
import java.io.*; 
public class Solution {
    static long res;
    
    public static void merge(long[] arr, int l, int m, int r) {
        long[] sortedCopyLR = new long[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                sortedCopyLR[k++] = arr[i++];
            } else {
                res += m - i + 1;
                sortedCopyLR[k++] = arr[j++];
            }
        }
        while (i <= m) sortedCopyLR[k++] = arr[i++];
        while (j <= r) sortedCopyLR[k++] = arr[j++];
        for (long num : sortedCopyLR) arr[l++] = num;
    }
    
    public static void mergeSort(long[] arr, int l, int r) {
        if (l == r) return;
        int m = l + (r - l) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
    
    public static long getInversions(long arr[], int n) {
        res = 0;
        mergeSort(arr, 0, n - 1);
        return res;
    }
}
