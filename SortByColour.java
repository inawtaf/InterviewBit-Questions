package iB;

import java.util.ArrayList;

public class SortByColour {
	public static void sortColors(ArrayList<Integer> a) {
	    int i = 0;
	    int j = a.size() - 1;
	    int mid = (i + a.size() - 1)/2;
	    int numbers = 0;
	    int twos = 0;
	    System.out.println(a.size());
	    for(;i<j;){
	    	System.out.println("Element under consideration : "+a.get(i)+" at i = "+i+" numbers = "+numbers+" size = "+a.size());
	    	if(a.get(i)==2){
	    		a.remove(i);
	    		a.add(j,2);
	    		j--;
	    	}
	    	else{
	    		i++;
	    	}
	    }
	    for(i=0;i<a.size();i++) System.out.print(a.get(i)+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2};
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) a.add(array[i]);
		sortColors(a);
		for(int i=0;i<array.length;i++) System.out.print(a.get(i)+" ");
	}

}
