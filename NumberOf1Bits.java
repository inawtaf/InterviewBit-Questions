package iB;

public class NumberOf1Bits {
	public static long pow(int i){
		if(i<=0) return 1;
		return (long) Math.pow(2, i);
	}
	public static int numSetBits(long a) {
		long num = a;
		int count = 0;
		while(num>0){
			int i = 0;
			while(pow(i)<num) i++;
			num = (num%pow(i-1));
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		System.out.println(numSetBits(4));
	}

}
