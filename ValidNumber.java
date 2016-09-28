package iB;

public class ValidNumber {
	public static int checkForSign(String a, int index){
		if(a.charAt(index)=='+'||a.charAt(index)=='-') return index+1;
		return index;
	}
	public static boolean haveDecimal(String a, int index){
		while(index<a.length()){
			if(a.charAt(index)=='.'){
				return true;
			}
			index++;
		}
		return false;
	}
	public static int isNumber(final String a) {
		if(a.charAt(a.length()-1)=='.') {
//			System.out.println("Exit: 1");
			return 0;
		}
		boolean flag = false;
		boolean flag2 = false;
		int i = 0;
		for(i=0;i<a.length()&&a.charAt(i)==' ';i++);
		if(i==a.length()){
//			System.out.println("Exit: 2");
			return 0;
		}
		i = checkForSign(a,i);
		for(;i<a.length();i++){
			if(a.charAt(i)==46||(a.charAt(i)>=48&&a.charAt(i)<=57)||a.charAt(i)==101){
				if(a.charAt(i)==101){//e
					if(flag){
//						System.out.println("Exit: 3");
						return 0;
					}
					if(i<=a.length()-2){
						i = checkForSign(a,i+1);
					}
					if(i<=a.length()-2){
						if(haveDecimal(a,i+1)){
//							System.out.println("Exit: 4");
							return 0;
						}
					}
					else{
//						System.out.println("Exit: 5");
						return 0;//e is last
					}
				flag = true;
				}
			}
			else if(a.charAt(i)==46){
				if(flag2){
					return 0;
				}
				flag2 = true;
			}
			else{
//				System.out.println("Exit: 6");
				return 0;
			}
		}
//		System.out.println("Exit: 7");
		return 1;
	}
	public static void main(String[] args){
		System.out.println(isNumber("1"));
	}
}
