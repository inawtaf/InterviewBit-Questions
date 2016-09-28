package iB;

import java.util.ArrayList;
import java.util.List;

public class SearchForARange {
	public static int binarySearch(final List<Integer> a, int start, int end, int target){
		if(start>end) return 0;
		int key = 0;
		int mid = (start+end)/2;
		if(a.get(mid)==target) return mid;
		else if(a.get(mid)>target) key = binarySearch(a,start,mid-1,target);
		else if(a.get(mid)<target) key = binarySearch(a,mid+1,end,target);
		return key;
	}
	public static boolean binarySearchCheck(final List<Integer> a, int start, int end, int target){
		if(start>end){
			System.out.println("Returning False at Start = "+start+" End = "+end);
			return false;
		}
		int mid = (start+end)/2;
		if(a.get(mid)==target){
			return true;
		}
		else if(a.get(mid)>target) binarySearchCheck(a,start,mid-1,target);
		else{ 
			binarySearchCheck(a,mid+1,end,target);
		}
		return true;
	}
	public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
		ArrayList<Integer> beta = new ArrayList<Integer>();
		ArrayList<Integer> alpha = new ArrayList<Integer>();
		beta.add(-1);
		beta.add(-1);
		int index = binarySearch(a,0,a.size()-1,b);
		if(binarySearchCheck(a,0,a.size()-1,b)){
			int i = 0;
			while(index-i>=0&&a.get(index-i)==b) i++;
			alpha.add(index-i+1);
			i = 0;
			while(index+i<a.size()&&a.get(index+i)==b) i++;
			alpha.add(index+i-1);
			return alpha;
		}else{
			return beta;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(7);
		a.add(7);
		a.add(8);
		a.add(8);
		a.add(10);
		ArrayList<Integer> b = searchRange(a,9);
		for(int i=0;i<b.size();i++) System.out.print(b.get(i)+" ");
	}

}
//[5, 7, 7, 8, 8, 10]
