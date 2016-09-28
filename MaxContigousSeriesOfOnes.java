package iB;

import java.util.ArrayList;
class tripleInteger{
	int x;
	int y;
	int length;
}
public class MaxContigousSeriesOfOnes {
	public static ArrayList<Integer> maxone(ArrayList<Integer> a, int b) {
		int i = 1, j;
		ArrayList<Integer> pointer = new ArrayList<Integer>();
		pointer.add(0);
		while(i<a.size()){
			if(i+1<a.size()&&a.get(i)==0&&a.get(i+1)==1) pointer.add(i+1);
			i++;
		}
		i = 0;
		int maxL = 0;
		int maxS = 0;
		int maxE = 0;
		int power = b;
		int start = 0;
		int end = 0;
		int len = 0;
		int index = 0;
		while(i<a.size()&&start<a.size()){
			j = i;
			while(j<a.size()&&a.get(j)==1) j++;
			while(j<a.size()&&power>0&&a.get(j)==0){
				power--;
				j++;
			}
			if(j==a.size()){
				end = j;
				len = end - start;
				if(len>maxL){
					maxL = len;
					maxS = start;
					maxE = end;
				}
				break;
			}
			else if(power==0&&a.get(j)==0){
				end = j;
				len = end - start;
				if(len>maxL){
					maxL = len;
					maxS = start;
					maxE = end;
				}
				start = pointer.get(index);
				i = start;
			}	
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(i = start;i<end;i++) res.add(start);
		i = pointer.get(index++);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = {1,1,0,1,1,0,0,1,1,1};
		ArrayList<Integer> tem = new ArrayList<Integer>();
		for(int i=0;i<temp.length;i++) tem.add(temp[i]);
		ArrayList<Integer> tem2 = new ArrayList<Integer>();
		tem2 = maxone(tem,1);
		for(int i=0;i<tem2.size();i++) System.out.print(tem2.get(i)+" ");
	}

}
