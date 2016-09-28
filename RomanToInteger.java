package iB;

public class RomanToInteger {
	public static int romanToInt(String a) {
		int[] priority = new int[a.length()];
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)=='M'){
				priority[i] = 1000;
			}
			else if(a.charAt(i)=='D'){
				priority[i] = 500;
			}
			else if(a.charAt(i)=='C'){
				priority[i] = 100;
			}
			else if(a.charAt(i)=='L'){
				priority[i] = 50;
			}
			else if(a.charAt(i)=='X'){
				priority[i] = 10;
			}
			else if(a.charAt(i)=='V'){
			    priority[i] = 5;
			}
			else priority[i] = 1;
		}
		int sum = 0;
		for(int i=0;i<a.length();i++){
			if(i<a.length()-1&&priority[i]<priority[i+1]){
				sum+=(priority[i+1]-priority[i]);
				System.out.println("Adding: "+(priority[i+1]-priority[i]));
				i++;
			}
			else{
				sum+=priority[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("MDCCCIV"));
	}

}
//M is thousand
//C is hundred
//D is five hundred
//X is ten
//I is one
//V is five
//L is fifty
//M>D>C>L>X>I
//1954 as MCMLIV
//1990 as MCMXC
//2014 as MMXIV