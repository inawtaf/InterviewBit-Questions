package iB;

import java.util.Stack;

public class RedundantBraces {
	public static int braces(String a) {
		Stack<Character> s = new Stack<Character>();
		int i = 0;
		while(i<a.length()){
			char c = a.charAt(i);
			if(c=='('||c==')'||c=='+'||c=='-'||c=='/'||c=='*') s.add(c);
			i++;
		}
		String alpha = "";
		String beta = "";
		while(!s.isEmpty()){
			while(!s.isEmpty()&&(s.peek()=='+'||s.peek()=='-'||s.peek()=='/'||s.peek()=='*')) s.pop();
			while(!s.isEmpty()&&(s.peek()=='('||s.peek()==')')) alpha+=s.pop();
			int j = 0;
			char x;
			if(alpha.length()>0&&alpha.charAt(0)=='(') x = '(';
			else x = ')';
			while(j<alpha.length()&&alpha.charAt(j)==x) j++;
			if(j<alpha.length()){
				System.out.println("E1");
				return 1;
			}
			if(alpha.length()==beta.length()&&(!alpha.equals(beta))&&alpha.length()>1){
//				System.out.println("Alpha = "+alpha);
//				System.out.println("Beta = "+beta);
				return 1;
			}
			else{
//				System.out.println("Alpha = "+alpha);
//				System.out.println("Beta = "+beta);
				beta = alpha;
				alpha = "";
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(braces("(a+b)"));
	}

}
