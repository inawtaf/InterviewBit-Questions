package iB;

import java.util.ArrayList;

public class FirstMissingInteger {
	public static int sum(int x){
		return (x*(x+1))/2;
	}
	public int firstMissingPositive(ArrayList<Integer> a) {
	    int posSum = 0;
	    int posCount = 0;
	    int max = 0;
	    for(int i=0;i<a.size();i++){
	    	if(a.get(i)>0){
	    		posSum+=a.get(i);
	    		posCount++;
	    	}
	    	if(a.get(i)>max) max = a.get(i);
	    }
	    int total = sum(max);
	    if(total==posSum) return max+1;
	    else if(total>posSum) return 1;
	    else if(posCount == 1) return total - posSum;
	    else{//Some numbers are missing whose sum is 'diff', and count is 'missing'
	    	int diff = total - posSum; //diff is the sum if the missing integers
	    	int missing = max - posCount;
	    	int maxPos = diff/missing;
	    	
	    }
	    return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

