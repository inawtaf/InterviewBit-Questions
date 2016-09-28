package iB;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInTheArray {
	public static int func(List<Integer> a, int x){
		int count = 0;
		for(int i=0;i<a.size();i++){
			if(a.get(i)<=x) count++;
		}
		return count;
	}
	public static int kthsmallest(final List<Integer> a, int k) {
		//int size = a.get(0);
//		System.out.println(a.size());
		if(a.size()==0) return 0;
		int min = Integer.MAX_VALUE;
		int maxLimit = Integer.MAX_VALUE, minLimit = Integer.MIN_VALUE;
		boolean flag = false;
		for(int i=0;i<a.size();){
			int num = func(a,a.get(i));
			if(num==k) return a.get(i);
			else if(num>k){//look for numbers smaller than a.get(i), which means that a.get(i) should be the maxLimit
				maxLimit = a.get(i);
				flag = true;
				if(a.get(i)<min) min = a.get(i);
				while(i<a.size()&&!(a.get(i)>minLimit&&a.get(i)<maxLimit)) i++;
			}
			else{
				minLimit = a.get(i);
				while(i<a.size()&&!(a.get(i)>minLimit&&a.get(i)<maxLimit)) i++;
			}
		}//if i runs out the limit
		if(flag) return min;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		System.out.println(kthsmallest(a,1));
	}

}
