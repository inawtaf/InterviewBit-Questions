package iB;

public class PalindromeString {
	public static int isPalindrome(String a) {
		//Replace caps by small letters, and remove space
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)==' '||a.charAt(i)==':'||a.charAt(i)==','||a.charAt(i)==';') {
				a = a.substring(0,i)+a.substring(i+1);
				i--;
			}
		}
		System.out.println(a);
		int j = a.length()-1;
		int i = 0;
		for(;i<=j;){
			int diff = (int)a.charAt(i) - (int)a.charAt(j);
			if(diff==0||diff==(-32)||diff==32){
				i++;
				j--;
			}
			else{
				break;
			}
		}
		if(i>j) return 1;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

}
