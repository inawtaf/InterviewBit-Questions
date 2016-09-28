package iB;

import java.util.ArrayList;

public class MergeTwoSortedListsII {
	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		int j =0;
		for(int i=0;i<a.size();i++){
			for(;j<b.size()&&b.get(j)<=a.get(i);j++){
				a.add(i, b.get(j));
			}
		}
		for(;j<b.size();j++) a.add(b.get(j));
//		for(int i=0;i<a.size();i++) System.out.print(a.get(i)+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(5);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(2);
		b.add(7);
		merge(a,b);
	}

}
