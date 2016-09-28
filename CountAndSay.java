package iB;

public class CountAndSay {
	public static String countAndSay(int a) {
		String s = Integer.toString(a);
		String temp = "";
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			int count = 0;
			while(i<s.length()&&s.charAt(i)==c){
				i++;
				count++;
			}
			temp+=Integer.toString(count);
			temp+=c;
		}
		System.out.println(temp);
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countAndSay(2);
	}

}
