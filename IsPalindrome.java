package iB;

public class IsPalindrome {
	public static boolean isPalindrome(int a) {
	    if(a<0) return false;
	    String s = Integer.toString(a);
	    for(int i=0;i<=s.length()/2;i++){
	    	if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
	    }
	    return true;
	}
	public static void main(String[] args){
		if(isPalindrome(123)) System.out.println("True");
		else{
			System.out.println("False");
		}
	}
}
