package iB;

import java.util.ArrayList;

public class JustifiedText {
	public static ArrayList<String> fullJustify(ArrayList<String> a, int b) {
		String currString = "";
		ArrayList<String> list  = new ArrayList<String>();
		int currLength = 0;
		for(int i=0;i<a.size();i++){
			String s = a.get(i);
			currLength+=s.length();
			if(currLength>=b){
				int num = currString.length();
				num = b - num;//this is the number of req spaces
				int count = 0;
				for(int j=0;j<currString.length()&&num>0;j++){
					if(currString.charAt(j)==' '){
						count++;
						if(j!=currString.length()-1){
							currString = currString.substring(0, j+1)+" "+currString.substring(j+1);
//							System.out.println("####Curr String: "+currString);
							num--;
							j++;
						}
						else if(j==currString.length()-1&&count==1){
							for(int x=0;x<num;x++) currString+=" ";
						}
						else j = 0;
					}
					if(j==currString.length()-1&&num>0) j = 0;
				}
//				System.out.println("Curr String: "+currString);
				list.add(currString);
				currString = "";
				i--;
			}
			else{
				if(currString=="") currString = s;
				else currString+=(" "+s);
//				System.out.println("Adding to curr string: "+currString);
			}
			currLength = currString.length();
		}
		if(currString!=""){
//			System.out.println("Enter");
			int num = currString.length();
			num = b - num;
			int count = 0;
			for(int j=0;j<currString.length()&&num>0;j++){
				if(currString.charAt(j)==' '){
					count++;
					if(j!=currString.length()-1){
						currString = currString.substring(0, j+1)+" "+currString.substring(j+1);
//						System.out.println("####Curr String: "+currString);
						num--;
						j++;
					}
					else if(j==currString.length()-1&&count==1){
						for(int x=0;x<num;x++) currString+=" ";
					}
					else j = 0;
				}
				if(j==currString.length()-1&&num>0&&count>1) j = 0;
				else{
					for(int x=0;x<num;x++) currString+=" ";
				}
			}
//			System.out.println("Curr String: "+currString);
			list.add(currString);
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("What");
		list.add("must");
		list.add("be");
		list.add("shall");
		list.add("be.");
//		list.add("text");
//		list.add("justification.");
		ArrayList<String> alpha = fullJustify(list, 12);
		for(int i=0;i<alpha.size();i++) System.out.println(alpha.get(i));
	}

}
