package iB;

import java.util.ArrayList;

public class RearrangeArray {
	public static void arrange(ArrayList<Integer> a) {
		int[] array = new int[a.size()];
		for(int i=0;i<a.size();i++){
			array[a.get(i)]=a.get(i);
		}
		int size = a.size();
		//for(int i=0;i<a.size();i++) System.out.print(array[i]+" ");
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i=0;i<size;i++) b.add(array[i]);
		//for(int i=0;i<a.size();i++) System.out.println(b.get(i));
		a=b;
		for(int i=0;i<a.size();i++) System.out.println(a.get(i));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(0);
		a.add(2);
		a.add(1);
		a.add(3);
		arrange(a);
	}

}
