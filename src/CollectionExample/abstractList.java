package CollectionExample;

import java.util.ArrayList;
import java.util.List;

public abstract class abstractList {

	
	public List<String> getListObject(){
		
		List<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("testing");
		list.add("My example");
		return list;
		
		
	}
	
}
