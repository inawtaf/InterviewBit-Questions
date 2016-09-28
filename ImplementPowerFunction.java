package iB;

public class ImplementPowerFunction {
	public static int pow(int x, int n, int d) {
	    int product = 1;
	    int i = 0;
	    while(i<n){
	        product*=x;
	        i++;
	    }
	    i = 1;
	    while(d*i<product) i++;
	    int rem = (product-(d*(i-1)));
	    if(rem==d) return 0;
	    return rem;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(10,3,2));
	}

}
