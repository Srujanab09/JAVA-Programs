package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OverlappingProblem {

	static class Interval {

        int start;
        int end;

        public Interval() {
                this.start = 0;
                this.end = 0;
        }

        public Interval(int start, int end) {
                this.start = start;
                this.end = end;
        }

}

static ArrayList<Interval> getOverlapingInterval(List<Interval> intervals) {

        ArrayList<Interval> results = new ArrayList<Interval>();

        Collections.sort(intervals, new MyComparator());

        for(Interval result : intervals) {
            System.out.println("just after sort"+result.start+"   "+result.end);
    }
        System.out.println("=================");
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for (int index = 0; index <= intervals.size(); index++) {
                if (index == 0) {
                        start = intervals.get(index).start;
                        end = intervals.get(index).end;
                } else if (index != intervals.size()) {
                        if (intervals.get(index).start <= end) {
                                end = (intervals.get(index).end > end) ? intervals.get(index).end : end;
                        } else {
                                results.add(new Interval(start, end));
                                start = intervals.get(index).start;
                                end = intervals.get(index).end;
                        }
                } else {
                        results.add(new Interval(start, end));
                }

        }

        return results;
}

public static void main(String args[]) {
        
        List<Interval> listOfIntervals = new ArrayList<Interval>();
        listOfIntervals.add(new Interval(1,3));
        listOfIntervals.add(new Interval(2,6));
        listOfIntervals.add(new Interval(8, 12));
        listOfIntervals.add(new Interval(7,9));
        listOfIntervals.add(new Interval(10, 18));
        
        List<Interval> results = getOverlapingInterval(listOfIntervals);
        for(Interval result : results) {
                System.out.println(result.start+"   "+result.end);
        }

}

static class MyComparator implements Comparator<Interval> {

        @Override
        public int compare(Interval a, Interval b) {

                int first = a.start - b.start;
                System.out.println("first : "+ first);
                return (first == 0) ? (a.end - b.end) : first;
        }

}

}
