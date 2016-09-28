package iB;

import java.util.Scanner;

public class QuickSort {
	public static int[] quickSort(int[] array, int start, int end){
		if(start>=end) return array;
		int pivot = array[end];
		int pivotIndex = start;
		int temp = 0;
		for(int i=start;i<end;i++){
			if(array[i]<pivot){
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
		int[] array = new int[8];
		for(int i=0;i<8;i++) array[i] = scan.nextInt();
		array=quickSort(array,0,7);
		for(int i=0;i<8;i++) System.out.print(array[i]+" ");
		scan.close();
	}

}
