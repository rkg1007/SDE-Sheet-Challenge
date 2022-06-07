import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void sortIntervals(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                if (i1.start == i2.start) {
                    return i1.finish - i2.finish;
                }
                return i1.start - i2.start;
            }
        });
    }
    
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        sortIntervals(intervals);
        List<Interval> res = new ArrayList<>(intervals.length);
        int start = intervals[0].start;
        int finish = intervals[0].finish;
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start <= finish) {
                start = Math.min(start, intervals[i].start);
                finish = Math.max(finish, intervals[i].finish);
            } else {
                res.add(new Interval(start, finish));
                start = intervals[i].start;
                finish = intervals[i].finish;
            }
        }
        res.add(new Interval(start, finish));
        
        return res;
    }
}
