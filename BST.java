import java.util.*;
public class BST
{
static	class Node
	{
		int data;
		Node right;
		Node left;
		Node(int val){
			data=val;
		}
	}
	public static boolean search(Node root,int val){
		if(root==null){
			return false;
		}
		if(root.data==val){
			return true;
		}
		if(val>root.data){
			search(root.right,val);
		}
		if(root.data>val){
			search(root.left,val);
		}
		return false;
	}
	public static Node insert(Node root,int val){
		if(root==null){
			 root=new Node(val);
			return root;
		}
		if(root.data>val){
			root.left=insert(root.left,val);
		}
		else{
			root.right=insert(root.right,val);
		}
		return root;
	}
	public static void inorder(Node root){
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		return;
	}
	public static Node delete(Node root,int val){
		if(root.data<val){
			root.right= delete(root.right,val);
		}
	else	if(root.data>val){
			root.left= delete(root.left,val);
		}
		else{
			if(root.left==null&&root.right==null){
				return null;
			}
			else if(root.left==null){
				return delete(root.right,val);
			}
			else if(root.right==null){
				return delete(root.left,val);
			}
			Node is=successor(root.right);
				root.data=is.data;
			root.right=delete(root.right,is.data);
		}
		return root;
	}
	public static Node successor(Node root){
		if(root.left==null){
			return root;
		}
		return successor(root.left);
	}
	public static void main(String args[]){
		int val[]={3,4,2,5,6,7,9};
		Node root=null;
		for(int i=0;i<val.length;i++){
			root=insert(root,val[i]);
		}
		inorder(root);
		root=delete(root,2);
		System.out.println();
		inorder(root);
	   
	}
}