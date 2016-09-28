package iB;

import java.util.ArrayList;

public class ThreeSum {
	public int threeSumClosest(ArrayList<Integer> a, int b) {
		int i, j, k;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(i=0;i<a.size();i++){
			for(j=0;j<a.size();j++){
				if(j!=i){
					for(k=0;k<a.size();k++){
						if(k!=i&&k!=j){
							sum = a.get(i) + a.get(j) + a.get(k);
							int temp;
							if(sum>b){
								temp = sum - b;
								if(temp<min){
									max = sum;
									min = temp;
								}
							}
							else{
								temp = b -sum;
								if(temp<min){
									max = sum;
									min = temp;
								}
							}
						}
					}
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
