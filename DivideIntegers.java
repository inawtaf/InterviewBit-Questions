package iB;

public class DivideIntegers {
	public static int divide(int dividend, int divisor) {
		if(divisor==0) return 0;
		boolean dividendNeg = false;
		boolean divisorNeg = false;
		long divD = dividend, divS = divisor;
		if(dividend<0){
			divD = 0-divD;
			dividendNeg = true;
		}
		if(divisor<0){
			divS = 0-divS;
			divisorNeg = true;
		}
		int i = 0;
		while(i<2147483647&&divD>=divS){
			divD-=divS;
			i++;
		}
		if(i==2147483647){
			if(dividendNeg&&!divisorNeg) return 0 - i - 1;
			else if(!dividendNeg&&divisorNeg) return 0 - i - 1;
			else return i;
		}
		if(dividendNeg&&divisorNeg){
			return i;
		}
		else if(divisorNeg||dividendNeg){
			return  (0 - i);
		}
		return i;
	}
	public static void main(String[] args) {
		System.out.println(divide(-2147483648,-1));
	}

}
