package iB;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {
	public static ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
//		System.out.println(a.size()+" "+b.size());
	    ArrayList<Integer> array = new ArrayList<Integer>();
	    int j = 0;
	    for(int i=0;i<a.size();i++){
	        for(;j<b.size()&&b.get(j)<=a.get(i);j++){
//	        	System.out.println(i+" "+j+" "+a.get(i)+" "+b.get(j)+" "+(b.get(j)-a.get(i)));
	            if(b.get(j)-a.get(i)==0) {
//	            	System.out.println("Yo!");
//	            	System.out.println("Adding : "+b.get(j));
	            	array.add(b.get(j));
	            	break;
	            }
	        }
	    }
	    ArrayList<Integer> another = new ArrayList<Integer>();
	    int temp;
	    if(array.size()>0)another.add(array.get(0));
//	    for(int i=1;i<array.size();i++){
//	        temp = array.get(i-1);
//	        if(array.get(i)!=temp) another.add(array.get(i));
//	    }
	    return another;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(1000000);
		b.add(1000000);
		ArrayList<Integer> array = new ArrayList<Integer>();
		array = intersect(a,b);
		for(int i=0;i<array.size();i++) System.out.print(array.get(i)+" ");
	}

}
