package iB;

import java.util.ArrayList;

public class DiffferentBitsSumPairwise {
	public static int func(int x, int y){
		//System.out.println("Recieved :: x = "+x+" y = "+y);
		if(x==y) return 0;
		int[] array = new int[32];
		array = numSetBits(x);//O(n)
		int[] array2 = new int[32];
		array2 = numSetBits(y);//O(n)
		int count = 0;
		for(int i=0;i<32;i++){
			if(array[i]!=array2[i]) count++;
		}//O(n)
		return count;
	}
	public static long pow(int i){
		if(i<=0) return 1;
		return (long) Math.pow(2, i);
	}
	public static int[] numSetBits(long a) {
		long num = a;
		int[] array = new int[32];
		for(int i =0;i<32;i++) array[i]=0;
		if(a==0) return array;
		while(num>0){
			int i = 0;
			while(i<=31&&pow(i)<=num) i++;
			num = (num%pow(i-1));
			array[32-i] = 1;
		}
		return array;
	}
	public static int cntBits(ArrayList<Integer> A) {
		int sum = 0;
		for(int i=0;i<A.size();i++){
			for(int j=i+1;j<A.size();j++){
				sum+=func(A.get(i),A.get(j));//O(n3)
			}
		}
		return 2*sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(5);
		System.out.println(cntBits(a));
	}

}
