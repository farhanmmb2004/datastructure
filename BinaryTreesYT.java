import java.util.*;
public class BinaryTreesYT {
   static class Node {
       int data;
       Node left;
       Node right;


       Node(int data) {
           this.data = data;
           this.left = null;
           this.right = null;
       }
   }


   static class BinaryTree {
       static int idx = -1;
       public static Node buildTree(int nodes[]) {
           idx++;
           if(nodes[idx] == -1) {
               return null;
           }
           Node newNode = new Node(nodes[idx]); 
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
       }
	   public static void preorder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	   }
   public static void inorder(Node root){
	if(root==null){
		return;
	}
	inorder(root.left);
	System.out.print(root.data + " " );
	inorder(root.right);
   }
	public static void postorder(Node root){
		if(root==null){
			return ;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data +" ");
	}
	public static void levelorder(Node root){
		if(root==null){
			return;
		}
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			Node currnode = q.remove();
			if(currnode==null){
				System.out.println();
				if(q.isEmpty()){
					break;
				}
				q.add(null);
			}
			else{
				System.out.print(currnode.data +" ");
				if(currnode.left!=null){
					q.add(currnode.left);
				}
				if(currnode.right!=null){
					q.add(currnode.right);
				}
			}
		}
	}
	int CountOfNode(Node root){
		if(root==null){
			return 0;
		}
		int leftCount=CountOfNode(root.left);
		int rightCount=CountOfNode(root.right);
		return (leftCount+rightCount)+1;
	}
	int SumOfNode(Node root){
		if(root==null){
			return 0;
		}
		int LeftSum=SumOfNode(root.left);
		int RightSum=SumOfNode(root.right);
		return LeftSum+RightSum+root.data;
	}
	int HightOfTree(Node root){
		if(root==null){
			return 0;
		}
		int lefthight=HightOfTree(root.left);
		int righthight=HightOfTree(root.right);
		return Math.max(lefthight,righthight)+1;
	}
	public static class TreeInfo{
		int ht;
		int	dim;
		TreeInfo (int ht,int dim) {
			this.ht=ht;
			this.dim=dim;
		}
	}
	public static TreeInfo diameter(Node root){
		if(root==null){
			return new TreeInfo(0,0);
		}
		
		TreeInfo lefti=diameter(root.left);
		TreeInfo righti=diameter(root.right);
		int myhight=Math.max(lefti.ht,righti.ht)+1;
		int dia1=lefti.ht+righti.ht+1;
		int dia2=lefti.dim;
		int dia3=righti.dim;
		int mydia=Math.max(dia1,Math.max(dia2,dia3));
		return new TreeInfo(myhight,mydia);
	}
	public static int levelsum(Node root,int k){
		if(root==null){
			return 0;
		}
		Queue<Node> q=new LinkedList<>();
		int level=0;
		int sum=0;
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			Node currnode = q.remove();
			if(currnode==null){
				level++;
				if(q.isEmpty()){
					break;
				}
				if(level==k){
				while(!q.isEmpty()){
				//sum+=q.remove();
				}
				return sum;
				}
				q.add(null);
			}
			else{
				if(currnode.left!=null){
					q.add(currnode.left);
				}
				if(currnode.right!=null){
					q.add(currnode.right);
				}
			}
		}
		return 0;
	}
	  public static ArrayList<Integer> diagonal(Node root){
       ArrayList<Integer> list=new ArrayList<>();
       if(root==null){
           return list;
       }
       Queue<Node> q=new LinkedList<>();
           //add your code here.
           Node node =root;
       while(node!=null){
           list.add(node.data);
           if(node.left!=null){
               q.add(node);
           }
           if(node.right!=null){
               node=node.right;
           }
            else{
                   if(!q.isEmpty()){
                    node= q.remove();
                   }
                   else{
                   node=null;
                   }
               }
           }
           return list;
      }
   }
   public static void main(String args[]) {
       int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       BinaryTree tree = new BinaryTree();
	  Node root= tree.buildTree(nodes);
      ArrayList<Integer> list=new ArrayList<>();
	  list=diagonal(root);
   System.out.println(list);
   }
}
