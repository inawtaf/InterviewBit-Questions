package iB;

import java.util.ArrayList;

public class SetMatrixZeros {
	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {//Remove static
	    int columns = a.get(0).size();
	    int rows = a.size();
	    ArrayList<Integer> r = new ArrayList<Integer>();
	    ArrayList<Integer> c = new ArrayList<Integer>();
	    for(int i=0;i<rows;i++){
	    	for(int j=0;j<columns;j++){
	    		if(a.get(i).get(j)==0){
	    		    if(r.size()==0) r.add(i);
	    			else if(r.get(r.size()-1)!=i) r.add(i);
	    			if(c.size()==0) c.add(j);
	    			else if(r.get(c.size()-1)!=j) c.add(j);
	    		}
	    	}
	    }
	    //Here I get the coordinates of all zeros
	    for(int i=0;i<r.size();i++){
	    	int currentRow = r.get(i);
	    	for(int j=0;j<columns;j++) a.get(currentRow).set(j,0);
	    }
	    for(int i=0;i<c.size();i++){
	    	int currentColumn = c.get(i);
	    	for(int j=0;j<rows;j++) a.get(j).set(currentColumn,0);
	    }
	    for(int i=0;i<rows;i++){
	    	for(int j=0;j<columns;j++){
	    		System.out.print(a.get(i).get(j)+" ");
	    	}
	    	System.out.println();
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();
		b.add(0);
		b.add(0);
//		b.add(1);
		c.add(1);
		c.add(0);
//		c.add(1);
//		d.add(1);
//		d.add(1);
//		d.add(1);
		a.add(b);
		a.add(c);
//		a.add(d);
		setZeroes(a);
	}

}
