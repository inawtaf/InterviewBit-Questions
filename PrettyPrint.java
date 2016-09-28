package iB;

import java.util.ArrayList;

public class PrettyPrint {
	public static void fill(int[][] array, int i,int size){
		int origin = size/2;
		if(i==1){
			array[size/2][size/2]=1;
			return;
		}
		for(int row=origin-i+1, column=origin-i+1;row<=origin+i-1;row++) array[row][column] = i;
		for(int row=origin-i+1, column=origin-i+1;column<=origin+i-1;column++) array[row][column] = i;
		for(int row=origin-i+1, column=origin+i-1;row<=origin+i-1;row++) array[row][column] = i;
		for(int row=origin+i-1, column=origin-i+1;column<=origin+i-1;column++) array[row][column] = i;
		return;
	}
	public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
		int n = (2*a)-1;
		int[][] array = new int[n][n];
		for(int i=1;i<=a;i++) fill(array,i,n);
		ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++){
			ArrayList<Integer> row = new ArrayList<Integer>();
			for(int j=0;j<n;j++) row.add(array[i][j]);
			table.add(row);
		}
		return table;
	}
	public static void main(String[] args){
		prettyPrint(3);
	}
}
