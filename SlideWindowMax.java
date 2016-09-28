package iB;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SlideWindowMax {
	public static ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
		if(b>=a.size()){
	        int j = 0;
	        int max = Integer.MIN_VALUE;
	        for(;j<a.size();j++) if(a.get(j)>max) max = a.get(j);
	        ArrayList<Integer> temp2 = new ArrayList<Integer>();
	        temp2.add(max);
	        return temp2;
	    }
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		int index = -1;
		int i = 0;
		for(i=0;i+b-1<a.size();i++){
			int curr = a.get(i);
			while(!q.isEmpty()&&q.peek()<=curr){
				q.poll();
				index++;
			}
			if(q.isEmpty()) q.add(curr);
			else{
				if(i-index>=b){
					while(!q.isEmpty()&&i-index>=b){
						index++;
						q.poll();
					}
					//right number within the window appears
					while(!q.isEmpty()&&q.peek()<=curr){
						q.poll();
						index++;
					}
					if(q.isEmpty()) q.add(curr);
				}
			}
			temp.add(q.peek());
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int i = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(i<a.length){
			list.add(a[i++]);
		}
		ArrayList<Integer> another = slidingMaximum(list,1);
		i = 0;
		while(i<another.size()) System.out.print(another.get(i++)+" ");
	}
}
