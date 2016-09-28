package iB;

public class ReverseBits {
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
		int[] array2 = new int[32];
		for(int i =0;i<32;i++){
			array2[i] = array[31-i];
		}
		return array2;
	}
	public static long reverse(long a) {
		if(a==0) return 0;
		int[] array = new int[32];
		array = numSetBits(a);
		System.out.print("The bit rep is: ");
		for(int i=0;i<32;i++) System.out.print(array[i]+" ");
		System.out.println();
		long sum = 0;
		for(int i=0;i<32;i++){
			if(array[i]==1){
				sum+=(Math.pow(2, 31-i));
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(3));//3221225472
		System.out.println((long)Math.pow(2,31));
	}

}
