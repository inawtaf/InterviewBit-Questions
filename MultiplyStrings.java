package iB;

public class MultiplyStrings {
	public static String addition(String a, String b){
		String add = "";
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		while(i>=0&&j>=0){
			int num = (int)a.charAt(i) - 48;
//			System.out.println(num);
			int num2 = (int)b.charAt(j) - 48;
			num2 = num + num2 + carry;
//			System.out.println(num2);
			if(num2>9){
				carry = num2/10;
				num2 = num2%10;
			}else carry = 0;
			char c = (char)(num2+48);
			add = c + add;
//			System.out.println("    "+add);
			i--;
			j--;
		}
		while(i>=0){
			int num = (int)a.charAt(i) - 48;
			num+=carry;
			if(num>9){
				carry = num%100;
				num = num%10;
			}else carry = 0;
			char c = (char)(num+48);
			add = c + add;
			i--;
		}
		while(j>=0){
			int num = (int)b.charAt(j) - 48;
			num+=carry;
//			System.out.println("S: "+add+" "+num);
			if(num>9){
				carry = num/10;
				num = num%10;
			}else carry = 0;
			char c = (char)(num+48);
			add = c + add;
			j--;
		}//check for carry
		return add;
	}
	public static String multi(String a, int x){
		String p = "";
		int carry = 0;
		for(int i=a.length()-1;i>=0;i--){
			int j;
			int num = (int)a.charAt(i) - 48;
//			System.out.println("Num= "+num);
			int r = (num*x)%10;
			r+=carry;
//			System.out.println("R= "+r);
			String c = Integer.toString(r);
			for(j=0;j<c.length()&&c.charAt(j)=='0';j++);
			c = c.substring(j);
//			System.out.println("Char: "+c+" oo "+p);
			p = c + p;
//			System.out.println("P: "+p);
			if((num*x)>10){
				carry = (num*x)%100;
				carry/=10;
			}else carry = 0;
//			System.out.println("Carry = "+carry);
			for(j=0;j<p.length()&&p.charAt(j)=='0';j++);
			p = p.substring(j);
		}
		if(carry!=0) p = (char)(carry+48) + p;
		return p;
	}
	public static String multiply(String a, String b) {
		if(a=="0"||b=="0") return "0";
		String temp = "";
		String temp2 = "";
		if(a.length()<b.length()){
			temp = b;
			for(int i=a.length()-1;i>=0;i--){
				int num = (int)a.charAt(i) - 48;
				temp2 = multi(temp,num);
				temp2+='0';
				temp2 = addition(b,temp);
				temp = temp2;
			}
		}
		else{
			temp = "0";
			for(int i=b.length()-1;i>=0;i--){
				int num = (int)b.charAt(i) - 48;
//				System.out.println(num);
//				System.out.println("T: "+temp);
				temp2 = multi(a,num);
//				System.out.println("T2: "+temp2);
				if(i!=b.length()-1) {
					for(int j=b.length()-1;j>i;j--) temp2+='0';
					temp2 = addition(temp2,temp);
				}
				else{
					temp2 = addition(temp2,"0");
				}
//				System.out.println("T2New: "+temp2);
				temp = temp2;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(multi("99999",9));
//		System.out.println(addition("1","209"));
		System.out.println(multiply("3784692347689","0"));
	}

}//4466
