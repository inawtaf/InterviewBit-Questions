package iB;

import java.util.ArrayList;
import java.util.Scanner;

class factor{
	int freq;
	int num;
	factor(int x,int y) {int freq = x, num = y;}
}
public class PowerOfTwoIntegers {
	public static boolean isPrime(int n){
		int sq = (int) Math.sqrt(n);
		for(int i=2;i<=sq;i++) if(n%i==0) return false;
		return true;
	}
	public static boolean isPower(int a) {
		if(a==1) return true;
		if(isPrime(a)) return false;
		//find factors of the number excluding one and itself
		//scanning up to only a/2
		//all factors must be in pair
		if(a<4&&a>1) return false;
		ArrayList<factor> list = new ArrayList<factor>();
		int curr = 0;
		int top = 0;
		int save = a;
		for(int i=2;i<=save/2&&a>1;i++){
			if(a%i==0){
//				System.out.println("entering at i = "+i+" a = "+a);
				if(top == 0){
					factor temp = new factor(0,0);
					temp.num = i;
					temp.freq = 1;
					list.add(temp);
					curr = 0;
				}
				else if(i!=top){
					factor temp = new factor(0,0);
					temp.num = i;
					temp.freq = 1;
					list.add(temp);
					curr++;
				}
				else{
					factor temp = new factor(0,0);
					temp.num = i;
					temp.freq = list.get(curr).freq + 1;
//					System.out.println("temp fre1 = "+temp.freq);
					list.remove(curr);
					list.add(temp);
				}
				top = i;
				a/=i;
				i--;
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i =0;i<list.size();i++) System.out.println("factor = "+list.get(i).num+" freq = "+list.get(i).freq);
		for(int i =0;i<list.size();i++) if(list.get(i).freq<min&&list.get(i).freq>1) min = list.get(i).freq;
		System.out.println("min = "+min);
		if(!isPrime(min)){
			for(int i=2;i<=Math.sqrt(min);i++){
				boolean flag = true;
				if(min%i==0){
					for(int j =0;j<list.size();j++) {
						if(list.get(j).freq%i!=0){
							flag = false;
							break;
						}
					}
					if(flag) return true;
				}
			}
		}
		else{
			for(int j =0;j<list.size();j++) {
				if(list.get(j).freq%min!=0) return false;
			}
			return true;
		}
		return false;
    }
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(isPower(a));
		System.out.println(isPrime(11273));
		scan.close();
	}
}
