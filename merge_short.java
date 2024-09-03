import java.util.*;
class merge_sort {
   public static void divide(int arr[],int si,int ei){
   if(si>=ei){
	return;
   }
   int mid=si + (ei-si)/2;
   divide(arr,si,mid);
   divide(arr,mid+1,ei);
   conquer(arr,si,mid,ei);
   }
   public static void conquer(int arr[],int si,int mid,int ei){
   int merge=new int[ei-si+1];
   int x=0;
   int indx1=si;
   int indx2=mid+1;
   while(indx1<=mid && indx2<ei){
	if(arr[indx1]<arr[indx2]){
		merge[x++]=arr[indx1++];
	}
	else{
		merge[x++]=arr[indx2++];
	}
   }
	while(indx1<=mid){
		merge[x++]=arr[indx1++];
	}
    while(indx2<=ei){
		merge[x++]=arr[indx2++];
    }
   for(int i=0,j=si;i<arr.length;i++,j++){
arr[i]=merge[j];
   }
   for(i=0;i<arr.length;i++){
	System.out.println(a[i]);
   }
   }
   public static void main(String[]args){
	int a=new a[5];
	a
		={3,2,34,3,5};
	int n=a.length;
	divide(a,0,n-1);
   }
   }



	

