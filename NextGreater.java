package iB;

import java.util.ArrayList;
import java.util.Stack;

class dou{
	int val;
	int index;
}

public class NextGreater {
	public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
		Stack<dou> s = new Stack<dou>();
		ArrayList<dou> list = new ArrayList<dou>();
		ArrayList<dou> res = new ArrayList<dou>();
		int i = 0;
		while(i<a.size()){
			dou temp = null;
			temp.val = a.get(i);
			temp.index = i;
			list.add(temp);
			i++;
		}
		s.push(list.get(0));
		i = 1;
		while(i<list.size()){
			int element = list.get(i).val;
			int top = s.peek().val;
			if(top<element){
				res.add(s.pop());
				while(!s.isEmpty()&&list.get(i).val>s.peek().val){
					res.add(s.pop());
				}
			}
			i++;
		}
		return null;
	}
}
