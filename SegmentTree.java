import java.util.*;
class SegmentTree
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		System.out.println("Enter the elements : ");
		int[]nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		int seg[]=new int[4*n];
		build(0,0,n-1,seg,nums);
		System.out.println("Enter the updation index and value : ");
		System.out.print("i : ");
		int index=sc.nextInt();
		System.out.println();
		System.out.print("value : ");
		int value=sc.nextInt();
		System.out.println();
		update(0,0,n-1,index,value,seg);
        System.out.println("Enter the query : ");
		System.out.println("l : ");
		int l=sc.nextInt();
		System.out.println("r : ");
        int r=sc.nextInt();
		System.out.print(query(0,0,n-1,l,r,seg));
		// for(int i=0;i<14;i++){
		//	System.out.println(i+" : "+seg[i]);
		//}
	}
	public static void build(int i,int low,int high,int[]seg,int[] nums){
		if(low==high){
			seg[i]=nums[low];
			return ;
		}
		int mid=(low+high)/2;
		build(2*i+1,low,mid,seg,nums);
		build(2*i+2,mid+1,high,seg,nums);
		seg[i]=Math.min(seg[2*i+1],seg[2*i+2]);
	}
	public static int query(int i,int low,int high,int l,int r,int[]seg){
		if(l>high||r<low){
			return Integer.MAX_VALUE;
		}
		else if(high<=r&&low>=l){
			return seg[i];
		}
		int mid=(low+high)/2;
		int left=query(2*i+1,low,mid,l,r,seg);
		int right=query(2*i+2,mid+1,high,l,r,seg);
		return Math.min(left,right);
	}
	public static void update(int ind,int low,int high,int i,int val,int[]seg){
		if(low==high){
			seg[ind]=val;
			return ;
		}
		int mid=(low+high)/2;
		if(mid>=i){
			update(2*ind+1,low,mid,i,val,seg);
		}
		else{
			update(2*ind+2,mid+1,high,i,val,seg);
		}
		seg[ind]=Math.min(seg[2*ind+1],seg[2*ind+2]);
	}
}
