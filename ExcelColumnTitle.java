package iB;

import java.util.Scanner;

public class ExcelColumnTitle {
	public static String convertToTitle(int a) {
		int num = a;
		int k = num%26;
		if(k==0) k = 26;
		num-=k;
		k+=64;
		char c = (char)(k);
		String s = "" + c;
		System.out.println("c = "+c);
		while(num>0){
			num/=26;
			k = num%26;
			if(k==0) k = 26;
			num-=k;
			k+=64;
			char d = (char)(k);
			s = d + s;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(convertToTitle(a));
	}

}
