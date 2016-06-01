package CollectionExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class CollectionAddAll extends abstractList {


	
	public CollectionAddAll()
	{
		List<String> myInput = Arrays.asList("Add","me");
		
		List<String> inputs = getListObject();
		System.out.println("List before Adding" + inputs);
		
		Collections.addAll(inputs,"Add","to","this");		//Collections.addAll(list,elements)
		
		//System.out.println("List after adding elements" + inputs);
		
		
		
		
		Collections.copy(inputs, myInput);
		System.out.println("Output after copy" + inputs);
	}
	
}
