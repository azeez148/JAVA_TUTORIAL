package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Adding");
		list.add("Example");
		
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Elements:  " + iterator.next());
		}
		
		Enumeration<String> enumeration = Collections.enumeration(list);
		while(enumeration.hasMoreElements())
		{
			System.out.println("Elements :  " + enumeration.nextElement());
		}
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Map");
		map.put(2, "Example");
		map.put(1, "oVERwRITING");
		map.put(3, "Values");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			
			System.out.println("Elements: Key " + entry.getKey() + " Value : " + entry.getValue());
		}
		
		for (Integer keys : map.keySet()) {
			
			System.out.println("Elements: Key  " + keys + "Values: " + map.get(keys));
			
		}
		
		Set<Integer> iterator2 = map.keySet();
		
		
	}

}
