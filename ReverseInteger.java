package iB;

import java.util.Scanner;

public class ReverseInteger {
	public static int reverse(int a) {
		boolean flag = true;
		if(a<0){
			flag = false;
			a*=-1;
		}
		int rev = 0;
		int firstDig = a%10;
		for(int num=a, i=0;num>0;num/=10,i++){
			int digit = num%10;
//			System.out.println("i = "+i+" digit = "+digit+" rev = "+rev);
			if(i>=9&&firstDig>2) return 0;
			rev = (rev*10) + digit;
		}
		if((rev<0&&a>0)||(rev>0&&a<0)) return 0;
		if(flag) return rev;
		else return -rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(reverse(a));
	}

}
