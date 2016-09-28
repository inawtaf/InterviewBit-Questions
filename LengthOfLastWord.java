package iB;

public class LengthOfLastWord {
	public static int lengthOfLastWord(final String a) {
		int j = a.length()-1;
		int spaces = 0;
		while(a.charAt(j--)==' ') spaces++;
		if((a.charAt(j)>=97&&a.charAt(j)<=122)||(a.charAt(j)>=65&&a.charAt(j)<=90)){
			while(j>=0&&a.charAt(j)!=' ') j--;
			return a.length()-1-j-spaces;
		}
		else{
			while(j>=0&&a.charAt(j)!=' ') j--;
			return a.length()-2-j-spaces;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("Hello   "));
	}

}
