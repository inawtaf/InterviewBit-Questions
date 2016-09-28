package iB;

public class SortedPermutationsRank {
	public static long factorial(int x){
		long fact = 1;
		int i = 2;
		while(i<=x){
			fact*=i;
			i++;
		}
		return fact;
	}
//	public static String lowerCase(String x){
//		String y ="";
//		int i = 0;
//		while(i<x.length()){
//			int g = (int)x.charAt(i) - 97;
//			if(g<0) g+=(97-65);
//			y+=(char)(g+97);
//			i++;
//		}
//		return y;
//	}
	public static long findRank(String a) {
		if(a.length()==1) return 1;
		long rank = 1;
		int i = 0;
		long[] fact = new long[a.length()];
		i = 1;
		while(i<=a.length()){
			fact[i-1] = factorial(i);
			i++;
		}
		int[][] frequency = new int[58][2];
		i = 0;
		while(i<58) frequency[i++][0] = 0;
		i = a.length()-1;
		long[] results = new long[a.length()];
		int resIndex = 0;
		while(i>=0){
			int g = (int)a.charAt(i) - 65;
			if(g<58&&g>=0) frequency[g][0]++;
			int j = g - 1;
			int tempSum = 0;
			while(j>=0){
				tempSum+=frequency[j][0];
				j--;
			}
			long p;
			if(i!=a.length()-1) p = fact[a.length()-i-2];
			else p = 0;
			results[resIndex++] = p*tempSum;
			rank+=results[resIndex-1];
			i--;
		}
		rank = rank % 1000003;
		return rank;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findRank("aA"));
	}

}
