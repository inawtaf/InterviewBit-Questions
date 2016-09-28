package iB;

import java.util.ArrayList;

public class PrettyJson {
	public static String giveIndent(int indent){
		int i = 0;
		String s = "";
		while(i<indent){
			s+="\t";
			i++;
		}
		return s;
	}
	public static ArrayList<String> prettyJSON(String a) {
		int indent = 0;
		int i = 0;
		ArrayList<String> list = new ArrayList<String>();
		while(i<a.length()&&(a.charAt(i)!='{'&&a.charAt(i)!='[')) i++;
//		System.out.println("i = "+a.charAt(i));
		while(i<a.length()){
			String line = "";
			if(a.charAt(i)=='{'){
				line = giveIndent(indent)+"{";
				indent++;
				i++;
//				System.out.println("i = "+i+" line = "+line);
			}
			else if(a.charAt(i)=='['){
				line = giveIndent(indent)+"{";
				indent++;
				i++;
			}
			else if(a.charAt(i)=='}'){
				if(i+1<a.length()&&a.charAt(i+1)==',') {
					i++;
					line = giveIndent(indent-1)+"},";
				}
				else line = giveIndent(indent-1)+"}";
				indent--;
				i++;
			}
			else if(a.charAt(i)==']'){
				if(i+1<a.length()&&a.charAt(i+1)==',') {
					i++;
					line = giveIndent(indent-1)+"],";
				}
				else line = giveIndent(indent-1)+"]";
				indent--;
				i++;
			}
			else{
				line = giveIndent(indent);
				while(i<a.length()){
//					System.out.println("char = "+a.charAt(i));
					line+=a.charAt(i);
					if(a.charAt(i)==','){
						i++;
//						System.out.println("Exit 1");
						break;
					}
					i++;
					if(a.charAt(i)=='}'||a.charAt(i)==']'||a.charAt(i)=='{'||a.charAt(i)=='[') {
//						System.out.println("Exit 2");
						break;
					}
				}
//				System.out.println("i = "+i+" line = "+line);
			}
//			System.out.println("line = "+line+" i = "+i);
			list.add(line);
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = prettyJSON("{\"id\":100,\"firstName\":\"Jack\",\"lastName\":\"Jones\",\"age\":12},");
		int i = 0;
		System.out.println("size = "+list.size());
		while(i<list.size()) System.out.println(list.get(i++));
	}

}
