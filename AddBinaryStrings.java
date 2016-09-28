package iB;

public class AddBinaryStrings {
	public String addBinary(String a, String b) {
		int carry = 0;
		String s = "";
		int i = a.length() - 1;
		int j = b.length() - 1;
		while(i>=0&&j>=0){
			if(a.charAt(i)=='1'&&b.charAt(j)=='1'){
				if(carry==1) s = '1' + s;
				else{
					carry = 1;
					s = '0' + s;
				}
			}
			else if(a.charAt(i)=='1'&&b.charAt(j)=='0'){
				if(carry==0) s = '1' + s;
				else{
					s = '0' + s;
					carry = 1;
				}
			}
			else if(a.charAt(i)=='0'&&b.charAt(j)=='1'){
				if(carry==0) s = '1' + s;
				else{
					s = '0' + s;
					carry = 1;
				}
			}
			else{
				s = '0' + s;
				carry = 0;
			}
			i--;
			j--;
		}
		if(carry==1) s = '1' + s;
		return s;
	}
}
