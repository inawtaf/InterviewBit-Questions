package iB;

import java.util.Stack;

public class ReverseString {
	public String reverseString(String a) {
		Stack<Character> s = new Stack<Character>();
		int i = 0;
		while(i<a.length()){
			s.push(a.charAt(i));
			i++;
		}
		String str = "";
		while(!s.isEmpty()){
			str+=s.pop();
		}
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
