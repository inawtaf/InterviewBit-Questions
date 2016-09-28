package iB;

import java.util.ArrayList;

public class CompareVersionNumbers {
	public static String removeLeadingZeros(String s){
		int i = 0;
		while(i<s.length()&&s.charAt(i)=='0') i++;
		if(i==s.length()) return "0";
		return s.substring(i, s.length());
	}
	public static int integerValue(String s){
		if(s.compareTo("")==0) return 0;
		return Integer.parseInt(s);
	}
	public static int min(int x, int y){
		if(x>y) return y;
		return x;
	}
	public static int compare(String a, String b){
		a = removeLeadingZeros(a);
		b = removeLeadingZeros(b);
		if(a.length()>b.length()) return 1;//v1>v2
		else if(a.length()==b.length()){
			int i = 0;
			while(i<a.length()&&a.charAt(i)==b.charAt(i)) i++;
			if(i==a.length()) return 0;
			if(integerValue(""+a.charAt(i))>integerValue(""+b.charAt(i))) return 1;
			else return -1;
		}
		else{
			return -1;
		}
	}
	public static int compareVersion(String a, String b) {
		int key = 0;
		if(a.compareTo("")==1){
			int startB = 0;
			int j = 0;
			while(j<b.length()&&b.charAt(j)!='.') j++;
			if(integerValue(b.substring(startB,j))==0&&j>=b.length()) return 0;
			return -1;
		}
		else if(b.compareTo("")==1){
			int startA  = 0;
			int i = 0;
			while(i<a.length()&&a.charAt(i)!='.') i++;
			if(integerValue(a.substring(startA, i))==0&&i>=a.length()) return 0;
			return 1;
		}
		for(int i=0,j=0;i<a.length()&&j<b.length();i++,j++){
			int startA  = i;
			int startB = j;
			while(i<a.length()&&a.charAt(i)!='.') i++;
			while(j<b.length()&&b.charAt(j)!='.') j++;
//			System.out.println(a.substring(startA, i));
//			System.out.println(b.substring(startB,j));
			int x = compare(a.substring(startA, i),b.substring(startB,j));
			if(x!=0) return x;
			if(x==0){
//				if(i==a.length()&&j<b.length()){
//					startB = j;
//					while(j<b.length()&&b.charAt(j)!='.') j++;
//					if(integerValue(b.substring(startB,j))==0&&j>=b.length()) return 0;
//					return -1;
//				}
//				else if(i<a.length()&&j==b.length()){
//					startA  = i;
//					while(i<a.length()&&a.charAt(i)!='.') i++;
//					if(integerValue(a.substring(startA, i))==0&&i>=a.length()) return 0;
//					return 1;
//				}
				key = compareVersion(a.substring(i,a.length()),b.substring(j, b.length()));
			}
		}
		return key;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareVersion("13.0","13.0.8"));
	}

}
