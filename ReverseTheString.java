package iB;

public class ReverseTheString {
	public static String reverseWords(String a) {
		String temp = "";
	    for(int i=0;i<a.length();i++){
	    	while(i<a.length()&&a.charAt(i)==' ') i++;
	    	int start = i, end;
	    	/*if(i>0&&a.charAt(i-1)==' '){
	    		start = i;
	    	}*/
	    	while(i<a.length()&&a.charAt(i)!=' ') i++;
	    	end = i - 1;
	    	String currWord = a.substring(start,end+1);
	    	if(start==0) temp = currWord;
	    	else{ 
	    		temp = currWord + " " + temp; 
	    	}
	    }
	    return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("fwbpudnbrozzifml osdt  ulc jsx kxorifrhubk ouhsuhf  sswz qfho dqmy  sn myq igjgip iwfcqq"));
	}

}
