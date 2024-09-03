import java.util.*;
public class BinaryTree 
{
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
static class creattree{
	static int idx=-1;
  public static Node buildtree(int arr []){
	idx++;
	if(arr[idx]==-1){
		return null;
	}
	Node newnode=new Node(arr[idx]);
		newnode.left=buildtree(arr);
		newnode.right=buildtree(arr);
return newnode;
  }
}
	public static void main(String[] args) 
	{
		int nodes[]={1,2,4,-1,5,-1,-1,3,-1,6,-1,-1};
creattree tree=new creattree();
Node root=tree.buildtree(nodes);
System.out.println(root.data);
	}
}
