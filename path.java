import java.util.*;
class path
{
	public static int path(int i,int j, int m,int n){
if(i==m||j==n){
	return 0;
}
if(i==m-1&&j==n-1){
	return 1;
}
		int downpath= path(i+1,j,m,n);
		int rightpath=path(i,j+1,m,n);
		return downpath +rightpath;

	}
	public static void main (String[]args){
		int m=3,n=3;
		
		System.out.println(path(0,0,m,n));
	}
}

		
	

