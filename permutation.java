import java.util.*;
class permutation
{
	public static void permutations(String str,String per){
		if(str.length()==0){
			System.out.println(per);
			return;
		}
		for(int i=0;i<str.length();i++){
			String newstr;
			char current= str.charAt(i);
			newstr= str.substring(0,i)+str.substring(i+1);
			permutations(newstr,per+current);

	}
	}
	public static void main (String[]args){
		String s="abc";
		permutations(s,"");
	}
}

		
	

