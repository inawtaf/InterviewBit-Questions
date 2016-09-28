package iB;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallerElement {
	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
		Stack<Integer> s = new Stack<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		s.push(-1);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i)>s.peek()){
				list.add(s.peek());
				s.push(arr.get(i));
			}
			else{
				while(s.peek()!=-1&&s.peek()>=arr.get(i)) s.pop();
				list.add(s.peek());
				s.push(arr.get(i));
			}
		}
		return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34, 35, 27, 42, 5, 28, 39, 20, 28};
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int i = 0;
		while(i<a.length){
			temp.add(a[i]);
			i++;
		}
		ArrayList<Integer> temp2 = prevSmaller(temp);
		i = 0;
		while(i<temp2.size()){
			System.out.print(temp2.get(i)+" ");
			i++;
		}
	}

}
