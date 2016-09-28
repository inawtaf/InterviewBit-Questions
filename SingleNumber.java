package iB;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
	public static int singleNumber(final List<Integer> a) {
		int max = -2147483648;
		int min = 2147483647;
		for(int i=0;i<a.size();i++){
			if(max<a.get(i)) max = a.get(i);
			if(min>a.get(i)) min = a.get(i);
		}
		if(max<=0) max = min;
		int[] array = new int[max+1];
		for(int i=0;i<max+1;i++) array[i] = 0;
		for(int i=0;i<a.size();i++){
			array[a.get(i)]++;
		}
		for(int i=0;i<max+1;i++) if(array[i]==1) return i;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(3);
		a.add(5);
		a.add(3);
		a.add(1);
		System.out.println(singleNumber(a));
	}

}
