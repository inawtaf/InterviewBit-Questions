package iB;

import java.util.Stack;

public class SimplifyDirectoryPath {
	public static String simplifyPath(String a) {
		int i = 0;
		Stack<String> s = new Stack<String>();
		while(i<a.length()){
			while(i<a.length()&&a.charAt(i)!='/') i++;
			i++;
			String word = "";
			while(i<a.length()&&a.charAt(i)!='/') {
				word+=a.charAt(i);
				i++;
			}
			if(i+1<a.length()&&a.charAt(i+1)=='/'){
				boolean flag = true;
				i+=2;
				word+='/';
				while(i<a.length()&&a.charAt(i)!='/') {
					word+=a.charAt(i);
					i++;
					flag = false;
				}
				if(flag) word = word.substring(0,word.length()-1);
			}
			int j = 0;
			while(j<word.length()&&word.charAt(j)=='.') j++;
			if(word!=""&&j<word.length()){
//				System.out.println("Adding: "+word);
				s.add(word);
			}
		}
		String m = "/";
		if(s.isEmpty()) return "/";
//		System.out.println(s.peek());
		m+=s.pop();
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(simplifyPath("/home//foo/"));// /home/foo
	}

}
