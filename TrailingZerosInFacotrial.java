package iB;

public class TrailingZerosInFacotrial {
	public int trailingZeroes(int a) {
	    int num = 5;
	    int count = 0;
		while(num<=a){
	    	count+=(a/num);
	    	num*=5;
	    }
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
