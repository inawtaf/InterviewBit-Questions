package iB;

public class GridUniquePath {
	public static int uniquePaths(int a, int b) {
		if(b==1) return 1;
		else if(a==1) return 1;
		else if(a==2&&b==2) return 2;
		else{
			return uniquePaths(a-1,b) + uniquePaths(a,b-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePaths(2,3));
	}

}
