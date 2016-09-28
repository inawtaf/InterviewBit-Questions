package iB;

import java.util.ArrayList;
import java.util.Scanner;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class MergeIntervals {
	
	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {//remove static
		int size = intervals.size();
		if(newInterval.end<=intervals.get(0).end){
			if(newInterval.end>=intervals.get(0).start){
				intervals.get(0).start=newInterval.start;
				return intervals;
			}
		}
		return intervals;
    }
	
	public static void main(String[] args) {
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5;i++){
			Interval itv = new Interval();
			itv.start = scan.nextInt();
			itv.end = scan.nextInt();
			intervals.add(itv);
		}
		Interval newInterval = new Interval();
		newInterval.start = scan.nextInt();
		newInterval.end = scan.nextInt();
		ArrayList<Interval> finalIntervals = insert(intervals,newInterval);
		for(int i=0;i<finalIntervals.size();i++) System.out.print("{"+finalIntervals.get(i).start+","+finalIntervals.get(i).end+"} ");
		scan.close();
	}

}
