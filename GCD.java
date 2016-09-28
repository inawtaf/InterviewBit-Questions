package iB;

public class GCD {
	public static int min(int a, int b){
		if(a>b) return a;
		return b;
	}
	public static int gcd(int a, int b) {
		int temp = min(a,b);
		while(temp>1){
			if(a%temp==0&&b%temp==0) return temp;
			temp--;
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(gcd(6,9));
	}

}
