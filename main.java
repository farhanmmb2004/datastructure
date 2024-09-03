import java.util.*;
public class Main
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int s=sc.next();
		check(s);
	}
	public static	void check(String s){
			try{
				int found=0;
				for(int i=0;i<s.length();i++){
					if((s.charAt(i)='a')||(s.charAt(i)='o')||(s.charAt(i)='u')||(s.charAt(i)='i')||(s.charAt(i)='e'||)){
						found=1;
						break;
					}
				}
				if(found==0){
					throw new IllegalArgumentException("string cannot pass");
				}
			}
			catch(IllegalArgumentException e){
				System.out.println(e);
			}
		}
}


/*public class Main
{
	public static void main(String args[]){
		Table t=new Table();
		Table ts=new Table();
		thread1 t1=new thread1(t);
		thread2 t2=new thread2(t);
		thread1 t3=new thread1(ts);
		thread2 t4=new thread2(ts);
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}
}
 class Table
{
	public synchronized void printtable(int n){
	for(int i=1;i<=10;i++){
		System.out.println(n*i);
	}
	}
}
 class thread1 extends Thread
{
	Table t;
	thread1(Table t){
		this.t=t;
	}
	public void run(){
		t.printtable(5);
	}
}
class thread2 extends Thread
{
	Table t;
	thread2(Table t){
		this.t=t;
	}
	public void run(){
		t.printtable(4);
	}
}




/*public class Priority{
	public static void main(String args[]){
		Priority1 p1=new Priority1();
Priority2 p2=new Priority2();
p1.setPriority(10);
p2.setPriority(1);
p2.start();
p1.start();

	}
}
 class Priority1 extends Thread 
{
	public  void run() 
	{
		System.out.println("priority of thread 1");
	}
}
 class Priority2 extends Thread 
{
	public  void run() 
	{
		System.out.println("priority of thread 2");
	}
}*/


