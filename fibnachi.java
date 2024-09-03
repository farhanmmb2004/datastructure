import java.util.*;
class test
{
	public static void printfib(int a,int b,int c){
		if(c==0){
			return;
		}
		System.out.println(b);
		printfib(b,a+b,c-1);
	}
	public static void main(String[] args){
		
	    System.out.println("enter the terms in series : ");
		Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	System.out.println("0");
	printfib(0,1,n-1);
	}

	
}
	
		
	

