package iB;

import java.util.Scanner;

public class BackTrack1 {
	static int count = 1;
	public static boolean function(int[] array,int curr,int n){
//		System.out.print("Count: "+count+" Array: ");
//		for(int i=0;i<2*n;i++) System.out.print(array[i]+" ");
//		System.out.println();
		if(curr==0) return true;
		for(int i=0;i<2*n-curr-1;i++){
			boolean flag1 = array[i]==0;
			boolean flag2 = array[i+curr+1]==0;
			if(flag1&&flag2){
				array[i+curr+1]=curr;
				array[i]=curr;
				if(function(array,curr-1,n)){
					return true;
				}
				array[i+curr+1]=0;
				array[i]=0;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number n..");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[2*n];
		for(int i=0;i<2*n;i++) array[i]=0;
		scan.close();
		if(function(array,n,n)) for(int i=0;i<2*n;i++) System.out.print(array[i]+" ");
		else System.out.println("Not Possible!");
	}

}
