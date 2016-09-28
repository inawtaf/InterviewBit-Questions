package iB;

import java.util.ArrayList;

public class RemoveDuoplicatesFromSortedArrayII {
	public static int removeDuplicates(ArrayList<Integer> a) {
		int size = a.size();
	    if(!(a.size()>0)) return 0;
	    for(int i=2;i<size;i++){
	    	if(a.get(i)==a.get(i-1)&&a.get(i)==a.get(i-2)){
//	    		a.remove(i);
	    		int start = i;
	    		while(i<size){
	    			a.set(i, a.get(i+1));
	    			i++;
	    		}
	    		size--;
	    		i = start - 1;
	    	}
	    }
		return a.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(2);
//		int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
//		for(int i=0;i<array.length;i++) a.add(array[i]);
		System.out.println(removeDuplicates(a));
	}

}
