import java.util.HashMap; //for HashMap
import java.util.*;
class Hashmap 
{
	public static void main(String[] args) 
	{//country popultion
		HashMap<String,Integer> map=new HashMap<>();//first key typ,then value type
		map.put("india",120);//insertion
		map.put("china",150);
		map.put("US",30);
		//System.out.println(map);
		//if key already exist then value willbe update no new pair generet
		map.put("china",200);
//System.out.println(map);
		//search
		if(map.containsKey("china")){
			//System.out.println("present in the map");
		map.remove("china");
		}

		for(Map.Entry<String,Integer> e : map.entrySet()){
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
	}
}
