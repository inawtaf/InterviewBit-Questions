package iB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FavouriteSequence {

	public static String mergeLists(String a, String b){
        int sizeA = a.length();
        int sizeB = b.length();
        int i = 0, j = 0;
        String list = new String();
        while(i<sizeA&&j<sizeB){
            if(a.charAt(i)<b.charAt(j)){
                list+=(a.charAt(i));
                i++;
            }
            else if(a.charAt(i)==b.charAt(j)){
                list+=(a.charAt(i));
                i++;
                j++;
            }
            else{
                list+=(b.charAt(j));
                j++;
            }
        }
        if(i==sizeA&&j<sizeB){
            while(j<sizeB){
                list+=(b.charAt(j));
                j++;
            }
        }
        else if(i<sizeA&&j==sizeB){
            while(i<sizeA){
                list+=(a.charAt(i));
                i++;
            }
        }
        return list;
    }
	public static String sortString(String a){
		String b = "";
		int i = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(i<a.length()){
			list.add(Integer.valueOf(a.charAt(i)));
			i++;
		}
		Collections.sort(list);
		i = 0;
		while(i<a.length()){
			b+=list.get(i);
			i++;
		}
		return b;
	}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        ArrayList<String> table = new ArrayList<String>();
        while(i<n){
            String list = new String();
            int k = scan.nextInt();
            for(int j=0;j<k;j++) list+=(scan.nextInt());
            table.add(sortString(list));
            i++;
        }
        i = 0;
        String finalList = new String();
        if(table.size()==1){
            finalList = table.get(0);
        }
        else{
            finalList = mergeLists(table.get(0),table.get(1));
            i = 2;
            while(i<n){
                finalList = mergeLists(finalList,table.get(i));
            }
        }
        i = 0;
        while(i<finalList.length()){
            System.out.print(finalList.charAt(i)+" ");
        	i++;
        }
        scan.close();
    }

}