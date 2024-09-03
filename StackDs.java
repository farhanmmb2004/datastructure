// "static void main" must be defined in a public class.
public class StackDs{
    private static class Node{
        int data;
        Node next;
         Node(int data){
            this.data=data;
            next=null;
            }
    }
     static class Stack{
        public static Node head=null;
        //is empty
        public static boolean isempty(){
                return head==null;
        }
        //add
        public static void add(int data){
                Node newnode=new Node(data);
                if(isempty()){
                        head=newnode;
                                return ;
                }
                newnode.next=head;
                head=newnode;
        }
        //pop
        public static int pop(){
                if(isempty()){
                        return 0;
                }
                Node top=head;
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
         Stack s=new Stack();
            s.add(1);
            s.add(2);
            s.add(3);
            while(!s.isempty()){
            System.out.println(s.peek());
                    s.pop();
    }
    }
    }
