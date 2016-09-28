package iB;

import java.util.ArrayList;

public class LongestCommonPrefix {
	public static String commonString(String a, String b){
		int i = 0;
		String res = "";
		while(i<a.length()&&i<b.length()){
			if(a.charAt(i)==b.charAt(i)) res+=a.charAt(i);
			else break;
			i++;
		}
		return res;
	}
	public String longestCommonPrefix(ArrayList<String> a) {
		if(a.size()==1) return a.get(0);
		String res = commonString(a.get(0),a.get(1));
		int i = 2;
		while(i<a.size()){
			res = commonString(res,a.get(i));
			i++;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
