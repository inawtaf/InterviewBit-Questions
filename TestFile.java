package iB;

import java.util.ArrayList;

public class TestFile {
	public static String divide(String s){
		String q = "";
		
		return q;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		ArrayList<Integer> a6 = new ArrayList<Integer>();
		ArrayList<Integer> a8 = new ArrayList<Integer>();
		for(;i<10000000;i*=2){
			if(i%10==2) a2.add(i);
			else if(i%10==4) a4.add(i);
			else if(i%10==8) a8.add(i);
			else{
				a6.add(i);
			}
		}
		for(i=0;i<a2.size();i++) System.out.print(a2.get(i)+" ");
		System.out.println();
		for(i=0;i<a4.size();i++) System.out.print(a4.get(i)+" ");
		System.out.println();
		for(i=0;i<a6.size();i++) System.out.print(a6.get(i)+" ");
		System.out.println();
		for(i=0;i<a8.size();i++) System.out.print(a8.get(i)+" ");
		System.out.println();
	}

}
