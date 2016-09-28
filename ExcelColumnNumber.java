package iB;

import java.util.ArrayList;

public class ExcelColumnNumber {
	public static int titleToNumber(String a) {
		int len = a.length();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<len;i++) list.add(a.charAt(i)-64);
		int sum = 0;
		for(int i=0;i<len;i++){
			sum+=(Math.pow(26, len-i-1)*list.get(i));
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(titleToNumber("AAC"));
	}

}
