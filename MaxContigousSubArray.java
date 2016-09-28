package iB;

import java.util.ArrayList;
import java.util.List;

public class MaxContigousSubArray {
	public int maxSubArray(final List<Integer> a) {
	    boolean flag = checkIfNegative(a);
	    if(flag){
	    	return maximum(a);
	    }
	    ArrayList<Integer> array = new ArrayList<Integer>();
	    int negSum, posSum;
	    for(int i=0;i<a.size();i++){
	    	negSum=0;
	    	posSum=0;
	    	while(i<a.size()&&a.get(i)<0){
	    		negSum+=a.get(i);
	    		i++;
	    	}
	    	if(negSum!=0) array.add(negSum);
	    	while(a.get(i)>=0){
	    		posSum+=a.get(i);
	    		i++;
	    	}
	    	if(posSum!=0) array.add(posSum);
	    }
	    int maxSum = 0;
	    for(int i=0;i<array.size();i++){
	    	while(i<array.size()&&array.get(i)>0) i++;
	    	//Reached at the first positive
	    	
	    }
	    return 0;
    }
	public static int function(ArrayList<Integer> array, int i){
		if(i==array.size()-2)return array.get(i);
    	int tempSum = array.get(i+1)+array.get(i+2);
		return 0;
	}
	private int maximum(List<Integer> a) {
		int max = a.get(0);
		int i = 0;
		while(i<a.size()){
			if(a.get(i)>max) max=a.get(i);
			i++;
		}
		return max;
	}
	private boolean checkIfNegative(List<Integer> a) {
		int i = 0;
		while(i<a.size()){
			if(a.get(i)>0) break;
			i++;
		}
		if(i==a.size()) return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
