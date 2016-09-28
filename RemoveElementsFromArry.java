package iB;

import java.util.ArrayList;

public class RemoveElementsFromArry {
	public static int removeElement(ArrayList<Integer> a, int b) {
		int size = a.size();
		for(int i=0;i<a.size();i++){
			if(a.get(i)==b){
				a.remove(i);
				size--;
				i--;
			}
		}
		return size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		int[] array = 
	}

}
