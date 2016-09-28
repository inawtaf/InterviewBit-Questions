package iB;

import java.util.Stack;

public class GenerateAllParenthesis {
	public int isValid(String a) {
		int i = 0;
		Stack<Character> s = new Stack<Character>();
		while(i<a.length()){
			char c = a.charAt(i);
			if(c=='{'||c=='('||c=='[') s.push(c);
			else{
				if(c=='}'){
					if(!s.isEmpty()&&s.peek()=='{') s.pop();
					else return 0;
				}
				else if(c==']'){
					if(!s.isEmpty()&&s.peek()=='[') s.pop();
					else return 0;
				}
				else if(c==')'){
					if(!s.isEmpty()&&s.peek()=='(') s.pop();
					else return 0;
				}
				else return 0;
			}
			i++;
		}
		if(s.isEmpty()) return 1;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
