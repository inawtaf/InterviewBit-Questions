package iB;

public class ImplementStrStr {
	public static int strStr(final String haystack, final String needle) {
		if(haystack==null||needle==null||needle.length()>haystack.length()) return -1;
		int j = 0;
		for(int i=0;i<haystack.length();i++){
			char c = needle.charAt(0);
			while(i<haystack.length()&&haystack.charAt(i)!=c) i++;
			int start = i;
			//System.out.println(start+" "+haystack.charAt(i));
			if(i==haystack.length()) return -1;
			j = 0;
			while(i<haystack.length()&&j<needle.length()&&haystack.charAt(i)==needle.charAt(j)){
				i++;
				j++;
			}
			if(j==needle.length()) return start;
			i = start;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba","babaaa"));
	}

}
