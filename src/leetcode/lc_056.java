package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class lc_056 {
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) return intervals;

        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        List<Interval> res = new ArrayList<>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for(int i=1; i<intervals.size(); i++) {
            if (intervals.get(i).start <= end) {
                end = Math.max(intervals.get(i).end, end);
                start = Math.min(intervals.get(i).start, start);
            } else {
                // disjoint
                res.add(new Interval(start, end));
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }

        // last interval
        res.add(new Interval(start, end));
        return res;
    }

    public void run() {
        List<Interval> list = new ArrayList<>();
//        list.add(new Interval(1,3));
//        list.add(new Interval(2,6));
//        list.add(new Interval(8,10));
//        list.add(new Interval(15,18));
        list.add(new Interval(1,4));
        list.add(new Interval(0,0));

        List<Interval> res = merge(list);
        for(Interval interval: res) {
            System.out.println("start:"+interval.start+", end:"+interval.end);
        }
    }
}
