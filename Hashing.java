import java.util.HashSet;
class  Hashing
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		//search-set.contain(ele)
		if(set.contains(1)){
		System.out.println("contains 1");
		}
		//deletion- set.remove(ele)
		set.remove(1);
		if(set.contains(1)){
		System.out.println("contains 1");
		}
//size..
		System.out.println("size of set= "+set.size());
	    //print elemnt
		System.out.println(set);
	}
}
