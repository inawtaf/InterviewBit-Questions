package iB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestNumber {
	public static boolean compare(int x,int y){
		String X = Integer.toString(x);
		String Y = Integer.toString(y);
		String X1 = X + Y;
		String Y1 = Y + X;
		int x1 = Integer.parseInt(X1);
		int y1 = Integer.parseInt(Y1);
		if(x1>y1) return true;
		return false;
	}
	public static int[] quickSort(int[] array, int start, int end){
		if(start>=end) return array;
		int pivot = array[end];
		int pivotIndex = start;
		int temp = 0;
		for(int i=start;i<end;i++){
			if(compare(pivot,array[i])){//array[i]<pivot
				temp = array[i];
				array[i] = array[pivotIndex];
				array[pivotIndex] = temp;
				pivotIndex++;
			}
		}
		temp = array[pivotIndex];
		array[pivotIndex] = array[end];
		array[end] = temp;
		quickSort(array, start, pivotIndex-1);
		quickSort(array, pivotIndex+1, end);
		return array;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		while(i<5){
			temp.add(scan.nextInt());
			i++;
		}
		System.out.println(largestNumber(temp));
		scan.close();
	}
	public static String largestNumber(ArrayList<Integer> a) {//final List<Integer> a & remove static
		int size = a.size();
		int[] array = new int[size];
		for(int i=0;i<size;i++) array[i]=a.get(i);
		int[] array2 = quickSort(array,0,size-1);
		for(int i=0;i<size;i++) System.out.print(array[i]);
	    return quickSort(array,0,size-1).toString();
	    //Here in the array list index I will have all the indexes where there is fluctuation
	}
}
