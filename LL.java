import java.util.*;
public class LL {
	Node head;
    private int size;
	LL (){
		this.size=0;
	}
	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	// add first
	public void addfirst(String data) {
		Node newnode = new Node(data);
	size++;
		if (head == null) {
			head = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
		
	}

	// add last
	public void addlast(String data) {
		Node newnode = new Node(data);
		size++;
		if (head == null) {
			head = newnode;
			return;
		}
		Node curnode = head;
		while (curnode.next != null) {
			curnode = curnode.next;
		}
		curnode.next = newnode;

	}

	// remove first
	public void removefirst(){
	    if(head==null){
			System.out.println("already empty");
	    return;
		}
		head=head.next;
		 size--;
	}
	//remove last
	public void removelast(){
		  if(head==null){
			System.out.println("already empty");
	    return;
		}
		if(head.next==null){
			head=null;
		}
		size--;
		Node currnode=head;
		Node lastnode=head.next;
		while(lastnode.next!=null){
			currnode=currnode.next;
			lastnode=lastnode.next;
		}
		currnode.next=null;
	}

       // size 
    public void length(){
	System.out.println(size);
    }
   

   // reverse string by itretion
   public void reverseitr(){
	if (head==null||head.next==null){
	return;
	}
    Node curnode=head.next;
	Node prevnode=head;
	while(curnode!=null){
	Node nextnode=curnode.next;
	curnode.next=prevnode;
	//update
	prevnode=curnode;
	curnode=nextnode;
	}
	head.next=null;
	head=prevnode;
   }
// remove duplicate elements from linked list
public void removeduplicate(){
	if(head==null||head.next==null){
		return;
	}
	Node ptr1=head;
	while(ptr1!=null){
		Node ptr2=ptr1.next;
		Node pre=ptr1;
		while(ptr2!=null){
			if(ptr1.data==ptr2.data){
				pre.next=ptr2.next;
			}
			pre=ptr2;
			ptr2=ptr2.next;
		}
		ptr1=ptr1.next;
	}
	return;
}

  


  




		// print list
	public void printlist() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currnode = head;
		while (currnode != null) {
			System.out.print(currnode.data + "-->");
			currnode = currnode.next;
		}
		System.out.println("null");
	}



	public static void main(String[] args) {
		LL list = new LL();
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number of elements : ");
    int a=Sc.nextInt();
	System.out.println("enter the  elements : ");
	for(int i=0;i<a;i++){
	 String	e=Sc.next();
	 list.addlast(e);
	}
	printlist();
	removeduplicate();
	printlist();
}
}
