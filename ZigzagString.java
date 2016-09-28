package iB;

public class ZigzagString {
	public static String convert(String a, int b) {
		if(b==1) return a;
		if(b>=a.length()) return a;
		String res = "";
		int[] arrayD = new int[b-1];
		int index = 0;
		int i = 2*(b-1) - 1;
		while(index<b-1){
			arrayD[index++] = i; 
			i-=2;
		}
		index = 0;
		int a0 = 0;
		boolean flag = true;
		while(a0<b){
			flag = true;
			System.out.println("a0 = "+a0);
			res+=a.charAt(a0);
			int d1;
			if(index<b-1) d1 = arrayD[index];
			else d1 = arrayD[0];
			int d2;
			if(a0==0||a0==b-1) d2=d1;
			else d2 = arrayD[arrayD.length-index];
			int p = a0;
			d1++;
			d2++;
			System.out.println("d1 = "+d1+" d2 = "+d2);
			while(p<a.length()){
				if(flag){
					p+=d1;
					flag = false;
				}
				else{
					p+=d2;
					flag = true;
				}
				if(p<a.length()) System.out.println("p = "+(p));
				if(p<a.length()) res+=a.charAt(p);
			}
			index++;
			a0++;
			System.out.println("res = "+res);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("ABCDEFGHIJKLMNOPQRS",6));
	}

}
