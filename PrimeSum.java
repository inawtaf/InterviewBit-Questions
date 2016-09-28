package iB;

import java.util.ArrayList;

public class PrimeSum {
	public static boolean isPrime(int n){
		double root = Math.sqrt(n);
		for(int i=2;i<=root;i++) if(n%i==0) return false;
		return true;
	}
    public static ArrayList<Integer> primesum(int a) {//remove static
        //make an array of all the prime numbers upto n
    	ArrayList<Integer> pair = new ArrayList<Integer>();
    	for(int i=2, j=a-2;i<=a/2;){
    		if((i+j==a)&&isPrime(i)&&isPrime(j)){
    			pair.add(i);
    			pair.add(j);
    			return pair;
    		}
    		j--;
    		if(i>j){
    			i++;
    			j=a-1;
    		}
    	}
    	return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> pair = primesum(4);
		if(pair!=null){
			for(int i=0;i<2;i++) System.out.print(pair.get(i)+" ");
		}
		else{
			System.out.print("Hmm.");
		}
	}

};
