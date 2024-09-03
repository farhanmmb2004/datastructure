import java.util.*;
public class Priority{
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
}

