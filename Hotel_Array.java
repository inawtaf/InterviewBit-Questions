package iB;
import java.util.ArrayList;

public class Hotel_Array {
    public static class hotelCheck{
        int in;
        int out;
    }
    public static hotelCheck[] quickSort(hotelCheck[] array, int start, int end){
        if(start>=end) return array;
        int pivot = array[end].in;
        int pivotIndex = start;
        hotelCheck temp = null;
        for(int i=start;i<end;i++){
            if(array[i].in<pivot){
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
    public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {//Remove static from here
        int size = arrive.size();
        hotelCheck[] temp = new hotelCheck[size];
        int i = 0;
        while(i<depart.size()&&i<arrive.size()){
            hotelCheck alpha = new hotelCheck();
            alpha.in=arrive.get(i);
            alpha.out=depart.get(i);
            temp[i]=alpha;
            i++;
        }
        quickSort(temp,0,size-1);//This sort is working
        int maxRoom=0;
        for(i=0;i<size-1;i++){
        	int room = 1;
        	//i will iterate over all the end points & j will iterate over all the start points
        	int j=i+1;
        	while(j<size){
        		if(temp[j].in>temp[i].out) break;
        		room++;
        		j++;
        	}
        	if(room>maxRoom) maxRoom = room;
        }
        if(maxRoom>K) return false;
        return true;
    }
    public static void main(String[] args){
    	ArrayList<Integer> arrive = new ArrayList<Integer>();
    	ArrayList<Integer> depart = new ArrayList<Integer>();
    	arrive.add(1);
    	arrive.add(5);
    	arrive.add(3);
    	depart.add(2);
    	depart.add(8);
    	depart.add(6);
    	System.out.println(hotel(arrive,depart,1));
    }
}
