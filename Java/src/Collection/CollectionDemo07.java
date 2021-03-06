package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class PrintingContainers{

}

public class CollectionDemo07 {
	static Collection fill(Collection<String> collection){
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		return collection;
	}
	
	static Map fill(Map<String,String> map){
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));		
		System.out.println(fill(new LinkedHashSet<String>()));
		
		System.out.println(fill(new HashMap<String,String>()));
		System.out.println(fill(new TreeMap<String,String>()));
		System.out.println(fill(new LinkedHashMap<String,String>()));
	}
}
