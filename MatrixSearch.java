package iB;

import java.util.ArrayList;

public class MatrixSearch {
	public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    int rows = a.size();
	    int columns = a.get(0).size();
	    int startRow = 0;
	    int endRow = rows-1;
	    int startColumn = 0;
	    int endColumn = columns-1;
	    int midRow = rows/2;
	    int midColumn = columns/2;
	    while(startRow<=endRow&&startColumn<=endColumn){
	    	midRow = (startRow+endRow)/2;
	    	midColumn = (startColumn+endColumn)/2;
	    	if(a.get(midRow).get(midColumn)==b){
	    		return 1;
	    	}
	    	else if(a.get(midRow).get(midColumn)>b&&a.get(midRow).get(0)<=b){
	    		endColumn = midColumn-1;
	    	}
	    	else if(a.get(midRow).get(midColumn)<b&&a.get(midRow).get(columns-1)>=b){
	    		startColumn = midColumn+1;
	    	}
	    	else if(a.get(midRow).get(midColumn)>b){
	    		endRow = midRow - 1;
	    	}
	    	else if(a.get(midRow).get(midColumn)<b){
	    		startRow = midRow + 1;
	    	}
	    }
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(3);
		a1.add(5);
		a1.add(7);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(10);
		a2.add(11);
		a2.add(16);
		a2.add(20);
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(23);
		a3.add(30);
		a3.add(34);
		a3.add(50);
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		a.add(a1);
		a.add(a2);
		a.add(a3);
		System.out.println(searchMatrix(a,4));
	}

}
/*
[1,   3,  5,  7],
[10, 11, 16, 20],
[23, 30, 34, 50]
*/