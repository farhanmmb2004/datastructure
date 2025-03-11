public class QueueDS{
    private static class Node{
        int data;
        Node next;
         Node(int data){
            this.data=data;
            next=null;
            }
    }
     static class Queue{
        public static Node head=null;
		public static Node tail=null;
        //is empty
        public static boolean isempty(){
                return head==null;
        }
        //add
        public static void add(int data){
                Node newnode=new Node(data);
                if(isempty()){
                        head=newnode;
                        tail=newnode ;
                return;
				}
					tail.next=newnode;
					tail=newnode;
        }
        //pop
        public static int pop(){
                if(isempty()){
                        return 0;
                }
                Node top=head;
				if(head==tail){
					head=null;
					tail=null;
					return top.data;
				}
                head=head.next;
                return top.data;
        }
        //peek
        public static int peek(){
                if(isempty()){
                        return 0;
                }
                return head.data;
        }
}
    public static void main(String[] args) {
         Queue s=new Queue();
            s.add(1);
            s.add(2);
            s.add(6);
            while(!s.isempty()){
            System.out.println(s.peek());
                    s.pop();
    }
    }
    }
