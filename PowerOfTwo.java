package iB;

public class PowerOfTwo {
	public static String divide(String s){
		String q = "";
		int carry = 0;
		for(int i=0;i<s.length();i++){
			int num = (int)s.charAt(i) - 48 + 10*(carry);
			q+=(char)((num/2)+48);
			if(num%2!=0) carry=1;
			else carry=0;
		}
		if(carry!=0) return null;
		int i = 0;
		while(i<q.length()&&q.charAt(i)=='0') i++;
		q = q.substring(i);
		return q;
	}
	public static int power(String a) {
		String temp = a;
		System.out.println(temp);
		while(temp!=null){
			System.out.println(temp);
			if(temp.length()==1&&temp.charAt(0)=='2') return 1;
			temp = divide(temp);
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power("16"));
	}

}
