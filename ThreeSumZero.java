package iB;

import java.util.ArrayList;
import java.util.Collections;

class DoubleInt{
	int x;
	int y;
}
public class ThreeSumZero {
	public static int mag(int x){
		if(x>=0) return x;
		return -x;
	}
	public static ArrayList<DoubleInt> traverse(int index, ArrayList<Integer> a, int num){
		ArrayList<DoubleInt> temp = new ArrayList<DoubleInt>();
		if(num==-1) System.out.println("YO!");
		for(int i=index-1, j=index+1;i>=0&&j<a.size();){//check for a pair with sum equal to -num
			if(a.get(i)+a.get(j)==(-num)){
				DoubleInt e = new DoubleInt();
				e.x = a.get(i);
				e.y = a.get(j);
//				System.out.println("Adding: "+e.x+" "+num+" "+e.y);
				temp.add(e);
				i--;
				j++;
			}
			else{
				if(mag(a.get(i))<mag(a.get(j))) i--;
				else if(mag(a.get(i))==mag(a.get(j))){
					if(num<0) j++;
					else i--;
				}
				else j++;
			}
		}
		return temp;
	}
	public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
		Collections.sort(a);
		for(int i=0;i<a.size();i++) System.out.print(a.get(i)+" ");
		System.out.println();
		//I need to remove duplicates from a
//		ArrayList<Integer> q = new ArrayList<Integer>();
//		int j = 0, k = 1;
//		q.add(a.get(0));
//		for(;k<a.size();k++){
//			if(a.get(k)!=q.get(j)){
//				q.add(a.get(k));
//				j++;
//			}
//		}
//		for(int i=0;i<q.size();i++) System.out.print(q.get(i)+" ");
//		System.out.println();
		ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<a.size();i++){
			ArrayList<DoubleInt> temp = new ArrayList<DoubleInt>();
			temp = traverse(i,a,a.get(i));
			if(temp!=null){
				int j = 0;
				while(j<temp.size()){
					ArrayList<Integer> sample = new ArrayList<Integer>();
					sample.add(temp.get(j).x);
					sample.add(a.get(i));
					sample.add(temp.get(j).y);
					if(!b.contains(sample)){
						b.add(sample);
					}
					j++;
				}
			}
		}
		for(int i=0;i<b.size();i++){
			int size = b.get(i).size();
			for(int j=0;j<size;j++) System.out.print(b.get(i).get(j)+" ");
			System.out.println();
		}
		return b;
	}//1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(-4);
		a.add(0);
		a.add(0);
		a.add(5);
		a.add(-5);
		a.add(1);
		a.add(0);
		a.add(-2);
		a.add(4);
		a.add(-4);
		a.add(1);
		a.add(-1);
		a.add(-4);
		a.add(3);
		a.add(4);
		a.add(-1);
		a.add(-1);
		a.add(-3);
		threeSum(a);
	}

}
