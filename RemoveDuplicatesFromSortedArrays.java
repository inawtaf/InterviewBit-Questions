package iB;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArrays {
	public static int removeDuplicates(ArrayList<Integer> a) {
	    if(a==null) return 0;
	    int length = 1;
	    for(int i=1;i<a.size();i++){
	        if((a.get(i)-a.get(i-1))!=0){
	            System.out.print(a.get(i)+" ");
	            a.add(length,a.get(i));
	            i++;
	            length++;
	        }
	    } 
	    return length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) b.add(a[i]);
		System.out.println(removeDuplicates(b));
	}

}
//0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3